AGENCY TABLE;
ID, NAME, CITY_ID, ADDRESS, CONTACT, JOINING_DATE, LAST_DATE, CREATED_DATE, IS_DEACTIVATED.

AGENCY_SEAT_ALLOCATION TABLE;
ID, AGENCY_ID, BUS_ID, DATE, SEAT_NO, CREATED_DATE, IS_BOOKED, TICKET_PRICE, IS_PAID, IS_DEACTIVATED
	Note : sync booked ticket price with passenger booking table.(ON_PAID =TRUE ADD RECORD IN THE PASSENGER_BOOKING)