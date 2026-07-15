public class CodingGuild {
    public static void main(String[] args) {

        // name, age, rank, salary, and membership fee (float)
        String name = "Ravi";
        int age = 22;
        char rank = 'A';
        double salary = 50000.0;
        float membershipFee = 99.50;

        // annual bonus (12% of salary)
        double bonus = salary * 0.12;

        // Casting bonus to int
        int annualBonus = (int) bonus;

        // Printing formatted welcome card
        System.out.println("      WELCOME TO CODING GUILD   ");
        System.out.println("Name           : " + name);
        System.out.println("Age            : " + age);
        System.out.println("Rank           : " + rank);
        System.out.println("Salary         : ₹" + salary);
        System.out.println("Membership Fee : ₹" + membershipFee);
        System.out.println("Annual Bonus   : ₹" + annualBonus);
		System.out.println("           THANK YOU             ")
    }
}