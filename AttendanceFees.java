

class AttendanceFees {
    public static void main(String[] args) {
        int attendance <= 75;
        Boolean fees=true;

        if (attendance >= 75) {
            if (fees == true) {
                System.out.println("Eligible to write the exam.");
            } else {
                System.out.println("Not eligible - Pay the fees.");
            }
        } else {
            System.out.println("Not eligible - Attendance is below 75%.");
        }
    }
}