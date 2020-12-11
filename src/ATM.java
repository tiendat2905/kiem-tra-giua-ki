import java.util.Scanner;

public class ATM {
    private String name;
    private double accountBalance;
    double money = 0;
    double withdrawal = 0;

    public ATM() {
    }


    public ATM(String name, double accountBalance) {
        this.name = name;
        this.accountBalance = accountBalance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void atm() {
        int choice = -1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ngan hang ABC kinh chao Quy khach Nguyen Van A");
        System.out.println("1.A.Kiem tra tai khoan");
        System.out.println("2.D.Nap tien");
        System.out.println("3.W.Rut tien");
        System.out.println("4.H.Xem lich su 3 lan");
        System.out.println("5.X.Thoat");
        System.out.println("===========================================");
        System.out.println("nhap lua chon cua ban: ");
        while (choice != 5) {
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("So du trong tai khoan la: " + accountBalance + " Vnd");
                    System.out.println("Bam nut tiep theo de giao dich");
                    break;
                case 2:
                    System.out.println("Giao dich nap tien");
                    System.out.println("Vui long nhap so tien: ");
                    money = scanner.nextDouble();
                    System.out.println("So du trong tai khoan quy khach la: " + (money + accountBalance) + " Vnd" + "\n");
                    System.out.println("Bam nut tiep theo de giao dich");
                    System.out.println("===========================================");
                    break;
                case 3:
                    if (checkAccount()) {
                        System.out.println("Giao dich rut tien: ");
                        System.out.println("Vui long nhap so tien: ");
                        withdrawal = scanner.nextDouble();
                        System.out.println("Giao dich thanh cong. Ban vua da rut " + withdrawal + " thanh cong");
                        System.out.println("So du trong tai khoan quy khach la: " + (money + accountBalance - withdrawal) + " Vnd");
                        System.out.println("Bam nut tiep theo de giao dich");
                    } else {
                        System.out.println("Giao dich khong thanh cong.");
                        System.out.println("So du trong tai khoan la: " + accountBalance + " Vnd");
                        System.out.println("Ban khong the rut so tien hon so voi so du tai khoan");
                    }
                    System.out.println("===========================================");
                    break;
                case 4:
                    System.out.println("lich su giao dich");
                    System.out.println("1. Nap tien: " + money);
                    System.out.println("2. Nap tien: " + money);
                    System.out.println("3. Rut tien: " + withdrawal);
                    break;

                case 5:
                    System.out.println("Thoat");
                    break;
                default:
                    System.out.println("Ban nhap sai chuc nang");
                    System.out.println("Bam nut theo menu de tiep tuc giao dich");
                    System.out.println("===========================================");
                    break;
            }
        }
    }

    public boolean checkAccount(){
        if (withdrawal <= accountBalance + money){
            return true;
        }
        return false;
    }

    public void history(){

    }


    @Override
    public String toString() {
        return "ATM{" +
                "name='" + name + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }
}
