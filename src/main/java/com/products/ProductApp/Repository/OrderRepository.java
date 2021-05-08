package com.products.ProductApp.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.products.ProductApp.Model.UserOrder;

@Repository
public interface OrderRepository extends CrudRepository<UserOrder, Long>{
	
	@Query("select o from UserOrder o where o.userID=:userId")
	List<UserOrder> findAllByUserId(@Param("userId") Long userId);
}
