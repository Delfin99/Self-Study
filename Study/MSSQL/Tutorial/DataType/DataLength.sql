DATALENGTH

SELECT DATALENGTH('TechOnTheNet.com');
Result: 16

SELECT DATALENGTH('   TechOnTheNet.com   ');
Result: 22

SELECT DATALENGTH(1234);
Result: 4

SELECT DATALENGTH('2004-05-01');
Result: 10

SELECT DATALENGTH(' ');
Result: 1

SELECT DATALENGTH('');
Result: 0

SELECT DATALENGTH(NULL);
Result: NULL