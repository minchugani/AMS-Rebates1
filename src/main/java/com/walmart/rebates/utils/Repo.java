package com.walmart.rebates.utils;




import java.util.List;

import org.springframework.data.couchbase.core.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


import com.walmart.rebates.entities.AgreementHeader;

//@Repository
@Component
public interface Repo extends JpaRepository<AgreementHeader,Integer> {

//	@Query("select agreement_num from agreement_header agreement_num")
//	List<AgreementHeader> findagr() ;
	
}

