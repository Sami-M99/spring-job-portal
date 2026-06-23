package com.sami.demo;
import com.sami.demo.beans.Vehicle;
import com.sami.demo.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoMainClass {
    static void main() {
        // Normal Java Object
        Vehicle vehicle = new Vehicle();
        vehicle.setName("JMC");
        System.out.println("Normal Java Object = " + vehicle.getName());

        // Spring Bean
        // يعرف لمره واحده فقط للكل
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // سحبنا باستخدام النوع Vehicle
        var veh = context.getBean(Vehicle.class);
        System.out.println("Spring Bean with Vehicle Type = " + veh.getName());

        // سحبنا باستخدام النوع Integer
        Integer num = context.getBean(Integer.class);
        System.out.println("Spring Bean with Integer Type = " + num);

        // لا يمكننا السحب باستخدام النوع String لان هنالك اكثر من داله بنفس النوع
        // String hello = context.getBean(String.class);
        // System.out.println("Spring Bean String = " + hello);

        // لذلك نسحبها باستخدام الإسم بتحديد اسم الدله بالضبط
        String message = (String) context.getBean("message");
        System.out.println("Spring Bean with message Name = " + message);

    }
}
