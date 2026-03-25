class Employee {
    int empno;
    String ename;
    float basic, hra, da, netpay;

    float Calculate() {
        return basic + hra + da;
    }

    void havedata(int empno, String ename, float basic, float hra, float da) {
        this.empno = empno;
        this.ename = ename;
        this.basic = basic;
        this.hra = hra;
        this.da = da;
        netpay = Calculate();
    }

    void dispdata() {
        System.out.println(empno + " " + ename + " " + basic + " " + hra + " " + da + " " + netpay);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.havedata(1, "Amit", 10000, 2000, 1500);
        e.dispdata();
    }
}
