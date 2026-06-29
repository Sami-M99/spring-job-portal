package com.sami.jobportal_demo.audit;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 *  Auditing هي عملية تتبع
 *  يعطي Spring اسم المستخدم الحالي
 */
@Component("auditorAwareImpl")
public class AuditorAwareImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("Anonymous User");
    }
}

