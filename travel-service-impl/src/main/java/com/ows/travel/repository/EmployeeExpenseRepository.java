package com.ows.travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.ows.travel.entity.EmployeeExpenseEntity;

@Repository
public interface EmployeeExpenseRepository extends JpaRepository<EmployeeExpenseEntity, Long> {

	//,JpaSpecificationExecutor<EmployeeExpenseEntity>
	/*
	 * Reference : prisma-integration(new) = com.mediaocean.prisma.integration.domain.repository.DailyPlacementSyncViewRepository
	 * final Collection<Predicate> predicates = new LinkedList<>(); Path
	 * primaryKeyPath = root.get(PRIMARY_KEY);
	 * predicates.add(criteriaBuilder.equal(primaryKeyPath.get(PROVIDER_ID),
	 * primaryKey.getProviderId()));
	 * predicates.add(criteriaBuilder.equal(primaryKeyPath.get(LINE_ITEM_ID),
	 * primaryKey.getLineItemId()));
	 * predicates.add(criteriaBuilder.equal(primaryKeyPath.get(ACCOUNT_ID),
	 * primaryKey.getAccountId()));
	 * predicates.add(criteriaBuilder.lessThanOrEqualTo(root.get(
	 * PLACEMENT_START_DATE), primaryKey.getDeliveryDate()));
	 * predicates.add(criteriaBuilder.greaterThanOrEqualTo(root.get(
	 * PLACEMENT_END_DATE), primaryKey.getDeliveryDate()));
	 * criteriaBuilder.and(predicates.toArray(new Predicate[] {}));
	 */
}
