PAYMENT_STATUS TABLE;
	ID, NAME, IS_DEACTIVATED. e.g PAID, ON_HOLD, NOT_PAID, PAID_BUT_NOT_RECEIVED.

EXPENSE_TYPE TABLE;
	ID, NAME, IS_DEACTIVATED. e.g DIESEL, TOLL, FINE,  

BUS_MAINTAINACE TABLE;
	ID, BUS_ID, EMPLOYEE_ID(serviced_by), SERVCING_DATE, SERVICING_PLACE, NOTES, TOTAL_BILL, PAYEMENT_STATUS,  
	CREATED_DATE, CREATED_BY, MODIFIED_DATE, MODIFIED_BY, IS_DEACTIVATED

DAILY_BUS_EXPENSES:
	ID, BUS_ID, AMOUNT, EXPENSE_TYPE, REASON, PAID_BY/EMP_ID, CREATED_DATE, CREATED_BY, MODIFIED_DATE, MODIFIED_BY, IS_DEACTIVATED.

EMPLOYEE_EXPENSES TABLE;
	ID, EMPLOYEE_ID, TOTAL_AMOUNT, REASON, PAID_DATE, CREATED_DATE, CREATED_BY, MODIFIED_DATE, MODIFIED_BY, IS_DEACTIVATED
		e.g: ALLOWANCE, Other (medical emergency),
	
EMPLOYEE_SALARY
	ID, EMPLOYEE_ID, PAYMENT_DATE, PAYMENT_STATUS, AMOUNT, IS_DEACTIVATED, CREATED_DATE, CREATED_BY, MODIFIED_DATE, MODIFIED_BY.	

