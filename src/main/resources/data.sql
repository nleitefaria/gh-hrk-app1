INSERT INTO regions
VALUES (
	1,
	'Europe'
	);

INSERT INTO regions
VALUES (
	2,
	'Americas'
	);

INSERT INTO regions
VALUES (
	3,
	'Asia'
	);

INSERT INTO regions
VALUES (
	4,
	'Middle East and Africa'
	);

COMMIT;

INSERT INTO countries
VALUES (
	'IT',
	'Italy',
	1
	);

INSERT INTO countries
VALUES (
	'JP',
	'Japan',
	3
	);

INSERT INTO countries
VALUES (
	'US',
	'United States of America',
	2
	);

INSERT INTO countries
VALUES (
	'CA',
	'Canada',
	2
	);

INSERT INTO countries
VALUES (
	'CN',
	'China',
	3
	);

INSERT INTO countries
VALUES (
	'IN',
	'India',
	3
	);

INSERT INTO countries
VALUES (
	'AU',
	'Australia',
	3
	);

INSERT INTO countries
VALUES (
	'ZW',
	'Zimbabwe',
	4
	);

INSERT INTO countries
VALUES (
	'SG',
	'Singapore',
	3
	);

INSERT INTO countries
VALUES (
	'UK',
	'United Kingdom',
	1
	);

INSERT INTO countries
VALUES (
	'FR',
	'France',
	1
	);

INSERT INTO countries
VALUES (
	'DE',
	'Germany',
	1
	);

INSERT INTO countries
VALUES (
	'ZM',
	'Zambia',
	4
	);

INSERT INTO countries
VALUES (
	'EG',
	'Egypt',
	4
	);

INSERT INTO countries
VALUES (
	'BR',
	'Brazil',
	2
	);

INSERT INTO countries
VALUES (
	'CH',
	'Switzerland',
	1
	);

INSERT INTO countries
VALUES (
	'NL',
	'Netherlands',
	1
	);

INSERT INTO countries
VALUES (
	'MX',
	'Mexico',
	2
	);

INSERT INTO countries
VALUES (
	'KW',
	'Kuwait',
	4
	);

INSERT INTO countries
VALUES (
	'IL',
	'Israel',
	4
	);

INSERT INTO countries
VALUES (
	'DK',
	'Denmark',
	1
	);

INSERT INTO countries
VALUES (
	'HK',
	'HongKong',
	3
	);

INSERT INTO countries
VALUES (
	'NG',
	'Nigeria',
	4
	);

INSERT INTO countries
VALUES (
	'AR',
	'Argentina',
	2
	);

INSERT INTO countries
VALUES (
	'BE',
	'Belgium',
	1
	);

COMMIT;

INSERT INTO locations
VALUES (
	1000,
	'1297 Via Cola di Rie',
	'00989',
	'Roma',
	NULL,
	'IT'
	);

INSERT INTO locations
VALUES (
	1100,
	'93091 Calle della Testa',
	'10934',
	'Venice',
	NULL,
	'IT'
	);

INSERT INTO locations
VALUES (
	1200,
	'2017 Shinjuku-ku',
	'1689',
	'Tokyo',
	'Tokyo Prefecture',
	'JP'
	);

INSERT INTO locations
VALUES (
	1300,
	'9450 Kamiya-cho',
	'6823',
	'Hiroshima',
	NULL,
	'JP'
	);

INSERT INTO locations
VALUES (
	1400,
	'2014 Jabberwocky Rd',
	'26192',
	'Southlake',
	'Texas',
	'US'
	);

INSERT INTO locations
VALUES (
	1500,
	'2011 Interiors Blvd',
	'99236',
	'South San Francisco',
	'California',
	'US'
	);

INSERT INTO locations
VALUES (
	1600,
	'2007 Zagora St',
	'50090',
	'South Brunswick',
	'New Jersey',
	'US'
	);

INSERT INTO locations
VALUES (
	1700,
	'2004 Charade Rd',
	'98199',
	'Seattle',
	'Washington',
	'US'
	);

INSERT INTO locations
VALUES (
	1800,
	'147 Spadina Ave',
	'M5V 2L7',
	'Toronto',
	'Ontario',
	'CA'
	);

INSERT INTO locations
VALUES (
	1900,
	'6092 Boxwood St',
	'YSW 9T2',
	'Whitehorse',
	'Yukon',
	'CA'
	);

INSERT INTO locations
VALUES (
	2000,
	'40-5-12 Laogianggen',
	'190518',
	'Beijing',
	NULL,
	'CN'
	);

INSERT INTO locations
VALUES (
	2100,
	'1298 Vileparle (E)',
	'490231',
	'Bombay',
	'Maharashtra',
	'IN'
	);

INSERT INTO locations
VALUES (
	2200,
	'12-98 Victoria Street',
	'2901',
	'Sydney',
	'New South Wales',
	'AU'
	);

INSERT INTO locations
VALUES (
	2300,
	'198 Clementi North',
	'540198',
	'Singapore',
	NULL,
	'SG'
	);

INSERT INTO locations
VALUES (
	2400,
	'8204 Arthur St',
	NULL,
	'London',
	NULL,
	'UK'
	);

INSERT INTO locations
VALUES (
	2500,
	'Magdalen Centre',
	'OX9 9ZB',
	'Oxford',
	'Oxford',
	'UK'
	);

INSERT INTO locations
VALUES (
	2600,
	'9702 Chester Road',
	'09629850293',
	'Stretford',
	'Manchester',
	'UK'
	);

INSERT INTO locations
VALUES (
	2700,
	'Schwanthalerstr. 7031',
	'80925',
	'Munich',
	'Bavaria',
	'DE'
	);

INSERT INTO locations
VALUES (
	2800,
	'Rua Frei Caneca 1360 ',
	'01307-002',
	'Sao Paulo',
	'Sao Paulo',
	'BR'
	);

INSERT INTO locations
VALUES (
	2900,
	'20 Rue des Corps-Saints',
	'1730',
	'Geneva',
	'Geneve',
	'CH'
	);

INSERT INTO locations
VALUES (
	3000,
	'Murtenstrasse 921',
	'3095',
	'Bern',
	'BE',
	'CH'
	);

INSERT INTO locations
VALUES (
	3100,
	'Pieter Breughelstraat 837',
	'3029SK',
	'Utrecht',
	'Utrecht',
	'NL'
	);

INSERT INTO locations
VALUES (
	3200,
	'Mariano Escobedo 9991',
	'11932',
	'Mexico City',
	'Distrito Federal,',
	'MX'
	);

COMMIT;

SET FOREIGN_KEY_CHECKS = 0;

INSERT INTO departments
VALUES (
	10,
	'Administration',
	200,
	1700
	);

INSERT INTO departments
VALUES (
	20,
	'Marketing',
	201,
	1800
	);

INSERT INTO departments
VALUES (
	30,
	'Purchasing',
	114,
	1700
	);

INSERT INTO departments
VALUES (
	40,
	'Human Resources',
	203,
	2400
	);

INSERT INTO departments
VALUES (
	50,
	'Shipping',
	121,
	1500
	);

INSERT INTO departments
VALUES (
	60,
	'IT',
	103,
	1400
	);

INSERT INTO departments
VALUES (
	70,
	'Public Relations',
	204,
	2700
	);

INSERT INTO departments
VALUES (
	80,
	'Sales',
	145,
	2500
	);

INSERT INTO departments
VALUES (
	90,
	'Executive',
	100,
	1700
	);

INSERT INTO departments
VALUES (
	100,
	'Finance',
	108,
	1700
	);

INSERT INTO departments
VALUES (
	110,
	'Accounting',
	205,
	1700
	);

INSERT INTO departments
VALUES (
	120,
	'Treasury',
	NULL,
	1700
	);

INSERT INTO departments
VALUES (
	130,
	'Corporate Tax',
	NULL,
	1700
	);

INSERT INTO departments
VALUES (
	140,
	'Control And Credit',
	NULL,
	1700
	);

INSERT INTO departments
VALUES (
	150,
	'Shareholder Services',
	NULL,
	1700
	);

INSERT INTO departments
VALUES (
	160,
	'Benefits',
	NULL,
	1700
	);

INSERT INTO departments
VALUES (
	170,
	'Manufacturing',
	NULL,
	1700
	);

INSERT INTO departments
VALUES (
	180,
	'Construction',
	NULL,
	1700
	);

INSERT INTO departments
VALUES (
	190,
	'Contracting',
	NULL,
	1700
	);

INSERT INTO departments
VALUES (
	200,
	'Operations',
	NULL,
	1700
	);

INSERT INTO departments
VALUES (
	210,
	'IT Support',
	NULL,
	1700
	);

INSERT INTO departments
VALUES (
	220,
	'NOC',
	NULL,
	1700
	);

INSERT INTO departments
VALUES (
	230,
	'IT Helpdesk',
	NULL,
	1700
	);

INSERT INTO departments
VALUES (
	240,
	'Government Sales',
	NULL,
	1700
	);

INSERT INTO departments
VALUES (
	250,
	'Retail Sales',
	NULL,
	1700
	);

INSERT INTO departments
VALUES (
	260,
	'Recruiting',
	NULL,
	1700
	);

INSERT INTO departments
VALUES (
	270,
	'Payroll',
	NULL,
	1700
	);

SET FOREIGN_KEY_CHECKS = 1;

COMMIT;

INSERT INTO jobs
VALUES (
	'AD_PRES',
	'President',
	20000,
	40000
	);

INSERT INTO jobs
VALUES (
	'AD_VP',
	'Administration Vice President',
	15000,
	30000
	);

INSERT INTO jobs
VALUES (
	'AD_ASST',
	'Administration Assistant',
	3000,
	6000
	);

INSERT INTO jobs
VALUES (
	'FI_MGR',
	'Finance Manager',
	8200,
	16000
	);

INSERT INTO jobs
VALUES (
	'FI_ACCOUNT',
	'Accountant',
	4200,
	9000
	);

INSERT INTO jobs
VALUES (
	'AC_MGR',
	'Accounting Manager',
	8200,
	16000
	);

INSERT INTO jobs
VALUES (
	'AC_ACCOUNT',
	'Public Accountant',
	4200,
	9000
	);

INSERT INTO jobs
VALUES (
	'SA_MAN',
	'Sales Manager',
	10000,
	20000
	);

INSERT INTO jobs
VALUES (
	'SA_REP',
	'Sales Representative',
	6000,
	12000
	);

INSERT INTO jobs
VALUES (
	'PU_MAN',
	'Purchasing Manager',
	8000,
	15000
	);

INSERT INTO jobs
VALUES (
	'PU_CLERK',
	'Purchasing Clerk',
	2500,
	5500
	);

INSERT INTO jobs
VALUES (
	'ST_MAN',
	'Stock Manager',
	5500,
	8500
	);

INSERT INTO jobs
VALUES (
	'ST_CLERK',
	'Stock Clerk',
	2000,
	5000
	);

INSERT INTO jobs
VALUES (
	'SH_CLERK',
	'Shipping Clerk',
	2500,
	5500
	);

INSERT INTO jobs
VALUES (
	'IT_PROG',
	'Programmer',
	4000,
	10000
	);

INSERT INTO jobs
VALUES (
	'MK_MAN',
	'Marketing Manager',
	9000,
	15000
	);

INSERT INTO jobs
VALUES (
	'MK_REP',
	'Marketing Representative',
	4000,
	9000
	);

INSERT INTO jobs
VALUES (
	'HR_REP',
	'Human Resources Representative',
	4000,
	9000
	);

INSERT INTO jobs
VALUES (
	'PR_REP',
	'Public Relations Representative',
	4500,
	10500
	);

COMMIT;

INSERT INTO employees(employee_id,
	first_name,
	last_name,
	email,
	phone_number,
	hire_date,
	job_id,
	salary,
	commission_pct,
	manager_id,
	department_id)
VALUES (
	100,
	'Steven',
	'King',
	'SKING',
	'515.123.4567',
	CURRENT_TIMESTAMP,
	'AD_PRES',
	24000,
	10,
	NULL,
	90
);
	
INSERT INTO employees(employee_id,
	first_name,
	last_name,
	email,
	phone_number,
	hire_date,
	job_id,
	salary,
	commission_pct,
	manager_id,
	department_id)
VALUES (
	101,
	'Neena',
	'Kochhar',
	'NKOCHHAR',
	'515.123.4568',
	CURRENT_TIMESTAMP,
	'AD_VP',
	17000,
	NULL,
	100,
	90
);
	
INSERT INTO employees(employee_id,
	first_name,
	last_name,
	email,
	phone_number,
	hire_date,
	job_id,
	salary,
	commission_pct,
	manager_id,
	department_id)
VALUES (
	102,
	'Lex',
	'De Haan',
	'LDEHAAN',
	'515.123.4569',
	CURRENT_TIMESTAMP,
	'AD_VP',
	17000,
	NULL,
	100,
	90
);
	
INSERT INTO employees(employee_id,
	first_name,
	last_name,
	email,
	phone_number,
	hire_date,
	job_id,
	salary,
	commission_pct,
	manager_id,
	department_id)
VALUES (
	103,
	'Alexander',
	'Hunold',
	'AHUNOLD',
	'590.423.4567',
	CURRENT_TIMESTAMP,
	'IT_PROG',
	9000,
	NULL,
	102,
	60
);

INSERT INTO employees(employee_id,
	first_name,
	last_name,
	email,
	phone_number,
	hire_date,
	job_id,
	salary,
	commission_pct,
	manager_id,
	department_id)
VALUES (
	104,
	'Bruce',
	'Ernst',
	'BERNST',
	'590.423.4568',
	CURRENT_TIMESTAMP,
	'IT_PROG',
	6000,
	NULL,
	103,
	60
	);

INSERT INTO employees(employee_id,
	first_name,
	last_name,
	email,
	phone_number,
	hire_date,
	job_id,
	salary,
	commission_pct,
	manager_id,
	department_id)
VALUES (
	105,
	'David',
	'Austin',
	'DAUSTIN',
	'590.423.4569',
	CURRENT_TIMESTAMP,
	'IT_PROG',
	4800,
	NULL,
	103,
	60
	);

INSERT INTO employees(employee_id,
	first_name,
	last_name,
	email,
	phone_number,
	hire_date,
	job_id,
	salary,
	commission_pct,
	manager_id,
	department_id)
VALUES (
	106,
	'Valli',
	'Pataballa',
	'VPATABAL',
	'590.423.4560',
	CURRENT_TIMESTAMP,
	'IT_PROG',
	4800,
	NULL,
	103,
	60
	);

INSERT INTO employees(employee_id,
	first_name,
	last_name,
	email,
	phone_number,
	hire_date,
	job_id,
	salary,
	commission_pct,
	manager_id,
	department_id)
VALUES (
	107,
	'Diana',
	'Lorentz',
	'DLORENTZ',
	'590.423.5567',
	CURRENT_TIMESTAMP,
	'IT_PROG',
	4200,
	NULL,
	103,
	60
	);

INSERT INTO employees(employee_id,
	first_name,
	last_name,
	email,
	phone_number,
	hire_date,
	job_id,
	salary,
	commission_pct,
	manager_id,
	department_id)
VALUES (
	108,
	'Nancy',
	'Greenberg',
	'NGREENBE',
	'515.124.4569',
	CURRENT_TIMESTAMP,
	'FI_MGR',
	12000,
	NULL,
	101,
	100
	);

INSERT INTO employees(employee_id,
	first_name,
	last_name,
	email,
	phone_number,
	hire_date,
	job_id,
	salary,
	commission_pct,
	manager_id,
	department_id)
VALUES (
	109,
	'Daniel',
	'Faviet',
	'DFAVIET',
	'515.124.4169',
	CURRENT_TIMESTAMP,
	'FI_ACCOUNT',
	9000,
	NULL,
	108,
	100
	);

INSERT INTO employees(employee_id,
	first_name,
	last_name,
	email,
	phone_number,
	hire_date,
	job_id,
	salary,
	commission_pct,
	manager_id,
	department_id)
VALUES (
	110,
	'John',
	'Chen',
	'JCHEN',
	'515.124.4269',
	CURRENT_TIMESTAMP,
	'FI_ACCOUNT',
	8200,
	NULL,
	108,
	100
	);

INSERT INTO employees(employee_id,
	first_name,
	last_name,
	email,
	phone_number,
	hire_date,
	job_id,
	salary,
	commission_pct,
	manager_id,
	department_id)
VALUES (
	111,
	'Ismael',
	'Sciarra',
	'ISCIARRA',
	'515.124.4369',
	CURRENT_TIMESTAMP,
	'FI_ACCOUNT',
	7700,
	NULL,
	108,
	100
	);

INSERT INTO employees(employee_id,
	first_name,
	last_name,
	email,
	phone_number,
	hire_date,
	job_id,
	salary,
	commission_pct,
	manager_id,
	department_id)
VALUES (
	112,
	'Jose Manuel',
	'Urman',
	'JMURMAN',
	'515.124.4469',
	CURRENT_TIMESTAMP,
	'FI_ACCOUNT',
	7800,
	NULL,
	108,
	100
	);

INSERT INTO employees(employee_id,
	first_name,
	last_name,
	email,
	phone_number,
	hire_date,
	job_id,
	salary,
	commission_pct,
	manager_id,
	department_id)
VALUES (
	113,
	'Luis',
	'Popp',
	'LPOPP',
	'515.124.4567',
	CURRENT_TIMESTAMP,
	'FI_ACCOUNT',
	6900,
	NULL,
	108,
	100
	);

INSERT INTO employees(employee_id,
	first_name,
	last_name,
	email,
	phone_number,
	hire_date,
	job_id,
	salary,
	commission_pct,
	manager_id,
	department_id)
VALUES (
	114,
	'Den',
	'Raphaely',
	'DRAPHEAL',
	'515.127.4561',
	CURRENT_TIMESTAMP,
	'PU_MAN',
	11000,
	NULL,
	100,
	30
	);

INSERT INTO employees(employee_id,
	first_name,
	last_name,
	email,
	phone_number,
	hire_date,
	job_id,
	salary,
	commission_pct,
	manager_id,
	department_id)
VALUES (
	115,
	'Alexander',
	'Khoo',
	'AKHOO',
	'515.127.4562',
	CURRENT_TIMESTAMP,
	'PU_CLERK',
	3100,
	NULL,
	114,
	30
	);

INSERT INTO employees(employee_id,
	first_name,
	last_name,
	email,
	phone_number,
	hire_date,
	job_id,
	salary,
	commission_pct,
	manager_id,
	department_id)
VALUES (
	116,
	'Shelli',
	'Baida',
	'SBAIDA',
	'515.127.4563',
	CURRENT_TIMESTAMP,
	'PU_CLERK',
	2900,
	NULL,
	114,
	30
	);

INSERT INTO employees(employee_id,
	first_name,
	last_name,
	email,
	phone_number,
	hire_date,
	job_id,
	salary,
	commission_pct,
	manager_id,
	department_id)
VALUES (
	117,
	'Sigal',
	'Tobias',
	'STOBIAS',
	'515.127.4564',
	CURRENT_TIMESTAMP,
	'PU_CLERK',
	2800,
	NULL,
	114,
	30
	);

INSERT INTO employees(employee_id,
	first_name,
	last_name,
	email,
	phone_number,
	hire_date,
	job_id,
	salary,
	commission_pct,
	manager_id,
	department_id)
VALUES (
	118,
	'Guy',
	'Himuro',
	'GHIMURO',
	'515.127.4565',
	CURRENT_TIMESTAMP,
	'PU_CLERK',
	2600,
	NULL,
	114,
	30
	);

INSERT INTO employees(employee_id,
	first_name,
	last_name,
	email,
	phone_number,
	hire_date,
	job_id,
	salary,
	commission_pct,
	manager_id,
	department_id)
VALUES (
	119,
	'Karen',
	'Colmenares',
	'KCOLMENA',
	'515.127.4566',
	CURRENT_TIMESTAMP,
	'PU_CLERK',
	2500,
	NULL,
	114,
	30
	);

INSERT INTO employees(employee_id,
	first_name,
	last_name,
	email,
	phone_number,
	hire_date,
	job_id,
	salary,
	commission_pct,
	manager_id,
	department_id)
VALUES (
	120,
	'Matthew',
	'Weiss',
	'MWEISS',
	'650.123.1234',
	CURRENT_TIMESTAMP,
	'ST_MAN',
	8000,
	NULL,
	100,
	50
	);

INSERT INTO employees(employee_id,
	first_name,
	last_name,
	email,
	phone_number,
	hire_date,
	job_id,
	salary,
	commission_pct,
	manager_id,
	department_id)
VALUES (
	121,
	'Adam',
	'Fripp',
	'AFRIPP',
	'650.123.2234',
	CURRENT_TIMESTAMP,
	'ST_MAN',
	8200,
	NULL,
	100,
	50
	);

INSERT INTO employees(employee_id,
	first_name,
	last_name,
	email,
	phone_number,
	hire_date,
	job_id,
	salary,
	commission_pct,
	manager_id,
	department_id)
VALUES (
	122,
	'Payam',
	'Kaufling',
	'PKAUFLIN',
	'650.123.3234',
	CURRENT_TIMESTAMP,
	'ST_MAN',
	7900,
	NULL,
	100,
	50
	);

INSERT INTO employees(employee_id,
	first_name,
	last_name,
	email,
	phone_number,
	hire_date,
	job_id,
	salary,
	commission_pct,
	manager_id,
	department_id)
VALUES (
	123,
	'Shanta',
	'Vollman',
	'SVOLLMAN',
	'650.123.4234',
	CURRENT_TIMESTAMP,
	'ST_MAN',
	6500,
	NULL,
	100,
	50
	);

INSERT INTO employees(employee_id,
	first_name,
	last_name,
	email,
	phone_number,
	hire_date,
	job_id,
	salary,
	commission_pct,
	manager_id,
	department_id)
VALUES (
	124,
	'Kevin',
	'Mourgos',
	'KMOURGOS',
	'650.123.5234',
	CURRENT_TIMESTAMP,
	'ST_MAN',
	5800,
	NULL,
	100,
	50
	);

INSERT INTO employees(employee_id,
	first_name,
	last_name,
	email,
	phone_number,
	hire_date,
	job_id,
	salary,
	commission_pct,
	manager_id,
	department_id)
VALUES (
	125,
	'Julia',
	'Nayer',
	'JNAYER',
	'650.124.1214',
	CURRENT_TIMESTAMP,
	'ST_CLERK',
	3200,
	NULL,
	120,
	50
	);

INSERT INTO employees(employee_id,
	first_name,
	last_name,
	email,
	phone_number,
	hire_date,
	job_id,
	salary,
	commission_pct,
	manager_id,
	department_id)
VALUES (
	126,
	'Irene',
	'Mikkilineni',
	'IMIKKILI',
	'650.124.1224',
	CURRENT_TIMESTAMP,
	'ST_CLERK',
	2700,
	NULL,
	120,
	50
	);

INSERT INTO employees(employee_id,
	first_name,
	last_name,
	email,
	phone_number,
	hire_date,
	job_id,
	salary,
	commission_pct,
	manager_id,
	department_id)
VALUES (
	127,
	'James',
	'Landry',
	'JLANDRY',
	'650.124.1334',
	CURRENT_TIMESTAMP,
	'ST_CLERK',
	2400,
	NULL,
	120,
	50
	);

INSERT INTO employees(employee_id,
	first_name,
	last_name,
	email,
	phone_number,
	hire_date,
	job_id,
	salary,
	commission_pct,
	manager_id,
	department_id)
VALUES (
	128,
	'Steven',
	'Markle',
	'SMARKLE',
	'650.124.1434',
	CURRENT_TIMESTAMP,
	'ST_CLERK',
	2200,
	NULL,
	120,
	50
	);

INSERT INTO employees(employee_id,
	first_name,
	last_name,
	email,
	phone_number,
	hire_date,
	job_id,
	salary,
	commission_pct,
	manager_id,
	department_id)
VALUES (
	129,
	'Laura',
	'Bissot',
	'LBISSOT',
	'650.124.5234',
	CURRENT_TIMESTAMP,
	'ST_CLERK',
	3300,
	NULL,
	121,
	50
	);

INSERT INTO employees(employee_id,
	first_name,
	last_name,
	email,
	phone_number,
	hire_date,
	job_id,
	salary,
	commission_pct,
	manager_id,
	department_id)
VALUES (
	130,
	'Mozhe',
	'Atkinson',
	'MATKINSO',
	'650.124.6234',
	CURRENT_TIMESTAMP,
	'ST_CLERK',
	2800,
	NULL,
	121,
	50
	);

INSERT INTO employees(employee_id,
	first_name,
	last_name,
	email,
	phone_number,
	hire_date,
	job_id,
	salary,
	commission_pct,
	manager_id,
	department_id)
VALUES (
	131,
	'James',
	'Marlow',
	'JAMRLOW',
	'650.124.7234',
	CURRENT_TIMESTAMP,
	'ST_CLERK',
	2500,
	NULL,
	121,
	50
	);

INSERT INTO employees(employee_id,
	first_name,
	last_name,
	email,
	phone_number,
	hire_date,
	job_id,
	salary,
	commission_pct,
	manager_id,
	department_id)
VALUES (
	132,
	'TJ',
	'Olson',
	'TJOLSON',
	'650.124.8234',
	CURRENT_TIMESTAMP,
	'ST_CLERK',
	2100,
	NULL,
	121,
	50
	);

INSERT INTO employees(employee_id,
	first_name,
	last_name,
	email,
	phone_number,
	hire_date,
	job_id,
	salary,
	commission_pct,
	manager_id,
	department_id)
VALUES (
	133,
	'Jason',
	'Mallin',
	'JMALLIN',
	'650.127.1934',
	CURRENT_TIMESTAMP,
	'ST_CLERK',
	3300,
	NULL,
	122,
	50
	);

INSERT INTO employees(employee_id,
	first_name,
	last_name,
	email,
	phone_number,
	hire_date,
	job_id,
	salary,
	commission_pct,
	manager_id,
	department_id)
VALUES (
	134,
	'Michael',
	'Rogers',
	'MROGERS',
	'650.127.1834',
	CURRENT_TIMESTAMP,
	'ST_CLERK',
	2900,
	NULL,
	122,
	50
	);

INSERT INTO employees(employee_id,
	first_name,
	last_name,
	email,
	phone_number,
	hire_date,
	job_id,
	salary,
	commission_pct,
	manager_id,
	department_id)
VALUES (
	135,
	'Ki',
	'Gee',
	'KGEE',
	'650.127.1734',
	CURRENT_TIMESTAMP,
	'ST_CLERK',
	2400,
	NULL,
	122,
	50
	);

INSERT INTO employees(employee_id,
	first_name,
	last_name,
	email,
	phone_number,
	hire_date,
	job_id,
	salary,
	commission_pct,
	manager_id,
	department_id)
VALUES (
	136,
	'Hazel',
	'Philtanker',
	'HPHILTAN',
	'650.127.1634',
	CURRENT_TIMESTAMP,
	'ST_CLERK',
	2200,
	NULL,
	122,
	50
	);

INSERT INTO employees(employee_id,
	first_name,
	last_name,
	email,
	phone_number,
	hire_date,
	job_id,
	salary,
	commission_pct,
	manager_id,
	department_id)
VALUES (
	137,
	'Renske',
	'Ladwig',
	'RLADWIG',
	'650.121.1234',
	CURRENT_TIMESTAMP,
	'ST_CLERK',
	3600,
	NULL,
	123,
	50
	);

INSERT INTO employees(employee_id,
	first_name,
	last_name,
	email,
	phone_number,
	hire_date,
	job_id,
	salary,
	commission_pct,
	manager_id,
	department_id)
VALUES (
	138,
	'Stephen',
	'Stiles',
	'SSTILES',
	'650.121.2034',
	CURRENT_TIMESTAMP,
	'ST_CLERK',
	3200,
	NULL,
	123,
	50
	);

INSERT INTO employees(employee_id,
	first_name,
	last_name,
	email,
	phone_number,
	hire_date,
	job_id,
	salary,
	commission_pct,
	manager_id,
	department_id)
VALUES (
	139,
	'John',
	'Seo',
	'JSEO',
	'650.121.2019',
	CURRENT_TIMESTAMP,
	'ST_CLERK',
	2700,
	NULL,
	123,
	50
	);

INSERT INTO employees(employee_id,
	first_name,
	last_name,
	email,
	phone_number,
	hire_date,
	job_id,
	salary,
	commission_pct,
	manager_id,
	department_id)
VALUES (
	140,
	'Joshua',
	'Patel',
	'JPATEL',
	'650.121.1834',
	CURRENT_TIMESTAMP,
	'ST_CLERK',
	2500,
	NULL,
	123,
	50
	);

COMMIT;

ALTER TABLE countries ADD FOREIGN KEY (region_id) REFERENCES regions(region_id);    
ALTER TABLE locations ADD FOREIGN KEY (country_id) REFERENCES countries(country_id);
ALTER TABLE departments ADD FOREIGN KEY (location_id) REFERENCES locations(location_id);
ALTER TABLE employees ADD FOREIGN KEY (job_id) REFERENCES jobs(job_id);
ALTER TABLE employees ADD FOREIGN KEY (department_id) REFERENCES departments(department_id);


