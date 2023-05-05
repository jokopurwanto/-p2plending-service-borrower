package com.p2plending.borrower.repository;

import com.p2plending.borrower.model.BorrowerModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;

public interface BorrowerRepository extends JpaRepository<BorrowerModel, Integer> {

    //    BorrowerModel findByNameAndDate(String name, Date date);
//    @Modifying
//    @Query("UPDATE tbl_packages u set u.availability =:availability where u.destination =:name AND u.date =:date")
//    CatalogModel updateByNameAndDate(@Param("availability") Integer availability, @Param("name") String name, @Param("date") Date date);

}
