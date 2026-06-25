package com.sami.jobportal_demo.repository;

import com.sami.jobportal_demo.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 🚩 Repository
 *
 * هي عبارة عن طبقة مسؤولة عن:
 * - إنشاء البيانات
 * - قراءة البيانات
 * - تحديث البيانات
 * - حذف البيانات
 * */

@Repository // Optional
public interface CompanyRepository extends JpaRepository<Company, Long> {
}

