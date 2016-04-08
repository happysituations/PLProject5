package cannata;

import java.util.*;

public class ListComprehension {
    public static void main(String[] args) {
        ArrayList<List<Object>> emp = new ArrayList<List<Object>>();
        List<Object> e1 = Arrays.asList(10, "JACKSON", "MARTA", "JACKSOMT", "27-FEB-91", "", "WAREHOUSE MANAGER", 1507, 0, 45, 2);
        List<Object> e2 = Arrays.asList(11, "HENDERSON", "COLIN", "HENDERCS", "14-MAY-90", "", "SALES REPRESENTATIVE", 1400, 10, 31, 3);
        List<Object> e3 = Arrays.asList(1, "MARTIN", "CARMEN", "MARTINCU", "3-MAR-90", "", "PRESIDENT", 4500, 0, 50, 0);
        List<Object> e4 = Arrays.asList(12, "GILSON", "SAM", "GILSONSJ", "18-JAN-92", "", "SALES REPRESENTATIVE", 1490, 12.5, 32, 3);
        List<Object> e5 = Arrays.asList(13, "SANDERS", "JASON", "SANDERJK", "18-FEB-91", "", "SALES REPRESENTATIVE", 1515, 10, 33, 3);
        List<Object> e6 = Arrays.asList(14, "DAMERON", "ANDRE", "DAMEROAP", "9-OCT-91", "", "SALES REPRESENTATIVE", 1450, 17.5, 35, 3);
        List<Object> e7 = Arrays.asList(15, "HARDWICK", "ELAINE", "HARDWIEM", "7-FEB-92", "", "STOCK CLERK", 1400, 0, 41, 6);
        List<Object> e8 = Arrays.asList(16, "BROWN", "GEORGE", "BROWNGW", "8-MAR-90", "", "STOCK CLERK", 940, 0, 41, 6);
        List<Object> e9 = Arrays.asList(17, "WASHINGTON", "THOMAS", "WASHINTL", "9-FEB-91", "", "STOCK CLERK", 1200, 0, 42, 7);
        List<Object> e10 = Arrays.asList(18, "PATTERSON", "DONALD", "PATTERDV", "6-AUG-91", "", "STOCK CLERK", 795, 0, 42, 7);
        List<Object> e11 = Arrays.asList(19, "BELL", "ALEXANDER", "BELLAG", "26-MAY-91", "", "STOCK CLERK", 850, 0, 43, 8);
        List<Object> e12 = Arrays.asList(2, "SMITH", "DORIS", "SMITHDJ", "8-MAR-90", "", "VP, OPERATIONS", 2450, 0, 41, 1);
        List<Object> e13 = Arrays.asList(20, "GANTOS", "EDDIE", "GANTOSEJ", "30-NOV-90", "", "STOCK CLERK", 800, 0, 44, 9);
        List<Object> e14 = Arrays.asList(21, "STEPHENSON", "BLAINE", "STEPHEBS", "17-MAR-91", "", "STOCK CLERK", 860, 0, 45, 10);
        List<Object> e15 = Arrays.asList(22, "CHESTER", "EDDIE", "CHESTEEK", "30-NOV-90", "", "STOCK CLERK", 800, 0, 44, 9);
        List<Object> e16 = Arrays.asList(23, "PEARL", "ROGER", "PEARLRG", "17-OCT-90", "", "STOCK CLERK", 795, 0, 34, 9);
        List<Object> e17 = Arrays.asList(24, "DANCER", "BONNIE", "DANCERBW", "17-MAR-91", "", "STOCK CLERK", 860, 0, 45, 7);
        List<Object> e18 = Arrays.asList(25, "SCHMITT", "SANDRA", "SCHMITSS", "9-MAY-91", "", "STOCK CLERK", 1100, 0, 45, 8);
        List<Object> e19 = Arrays.asList(3, "NORTON", "MICHAEL", "NORTONMA", "17-JUN-91", "", "VP, SALES", 2400, 0, 31, 1);
        List<Object> e20 = Arrays.asList(4, "QUENTIN", "MARK", "QUENTIML", "7-APR-90", "", "VP, FINANCE", 2450, 0, 10, 1);
        List<Object> e21 = Arrays.asList(5, "ROPER", "JOSEPH", "ROPERJM", "4-MAR-90", "", "VP, ADMINISTRATION", 2550, 0, 50, 1);
        List<Object> e22 = Arrays.asList(6, "BROWN", "MOLLY", "BROWNMR", "18-JAN-91", "", "WAREHOUSE MANAGER", 1600, 0, 41, 2);
        List<Object> e23 = Arrays.asList(7, "HAWKINS", "ROBERTA", "HAWKINRT", "14-MAY-90", "", "WAREHOUSE MANAGER", 1650, 0, 42, 2);
        List<Object> e24 = Arrays.asList(8, "BURNS", "BEN", "BURNSBA", "7-APR-90", "", "WAREHOUSE MANAGER", 1500, 0, 43, 2);
        List<Object> e25 = Arrays.asList(9, "CATSKILL", "ANTOINETTE", "CATSKIAW", "9-FEB-92", "", "WAREHOUSE MANAGER", 1700, 0, 44, 2);

        ArrayList<List<Object>> dept = new ArrayList<List<Object>>();
        List<Object> d1 = Arrays.asList(10, "FINANCE",1);
        List<Object> d2 = Arrays.asList(31,"SALES",1);
        List<Object> d3 = Arrays.asList(32, "SALES", 2);
        List<Object> d4 = Arrays.asList(33, "SALES", 3);
        List<Object> d5 = Arrays.asList(34, "SALES",4);
        List<Object> d6 = Arrays.asList(35, "SALES",5);
        List<Object> d7 = Arrays.asList(41,"OPERATIONS",1);
        List<Object> d8 = Arrays.asList(42,"OPERATIONS",2);
        List<Object> d9 = Arrays.asList(43, "OPERATIONS",3);
        List<Object> d10 = Arrays.asList(44,"OPERATIONS", 4);
        List<Object> d11 = Arrays.asList(45, "OPERATIONS",5);
        List<Object> d12 = Arrays.asList(50, "ADMINISTRATIONAL",5);

        //('ID', 'LAST_NAME', 'FIRST_NAME', 'USERID', 'START_DATE', 'COMMENTS', 'TITLE', 'SALARY', 'COMMISSION', 'DEPT_ID', 'MANAGER_ID')
        emp.add(e1); emp.add(e2); emp.add(e3); emp.add(e4); emp.add(e5); emp.add(e6); emp.add(e7);
        emp.add(e8); emp.add(e9); emp.add(e10); emp.add(e11); emp.add(e12); emp.add(e13); emp.add(e14);
        emp.add(e15); emp.add(e16); emp.add(e17); emp.add(e18); emp.add(e19); emp.add(e20); emp.add(e21);
        emp.add(e22); emp.add(e23); emp.add(e24); emp.add(e25);

        //('ID', 'NAME','REGION_ID')
        dept.add(d1); dept.add(d2); dept.add(d3); dept.add(d4); dept.add(d5); dept.add(d6); dept.add(d7);
        dept.add(d8); dept.add(d9); dept.add(d10); dept.add(d11); dept.add(d12);

        System.out.println();
        System.out.println("select ID from emp order by ID");
        emp.stream()
                .mapToInt(e -> (Integer)e.get(0))
                .sorted()
                .forEach(e -> {System.out.println(e);});

        System.out.println();
        System.out.println("select SALARY from emp where SALARY >= 1000");
        emp.stream()
                .filter(e -> (Integer)e.get(7) >= 1000 )
                .forEach(e -> {System.out.println(e);});

        System.out.println();
        System.out.println("select TITLE from emp where TITLE = 'WAREHOUSE MANAGER'");
        emp.stream()
                .filter(e -> e.get(6) == "WAREHOUSE MANAGER")
                .forEach(e -> {System.out.println(e);});

        System.out.println();
        System.out.println("select * from emp;");
        emp.stream()
                .forEach(e -> { System.out.println(e); });

        System.out.println(); //for readability
        System.out.println("select * from dept;");
        dept.stream()
                .forEach(d -> {System.out.println(d); });

        System.out.println();
        System.out.println("select * from ( select * from EMP where SAL >1000 order by dbms_random.value ) where rownum = 1");
        emp.stream()
                .filter(e -> (Integer)e.get(7) >= 1000 )
                .findAny()
                .ifPresent(System.out::println);

        System.out.println();
        System.out.println("select TITLE from ( select * from EMP where TITLE = 'WAREHOUSE MANAGER' order by dbms_random.value ) where rownum =1");
        emp.stream()
                .filter(e -> e.get(6) == "Warehouse Manager")
                .findAny()
                .ifPresent(System.out::println);

        System.out.println();
        System.out.println("select * from EMP minus select * from EMP where rownum <= 3");
        emp.stream()
                .skip(3)
                .forEach(e -> {System.out.println(e);});


    }
}
