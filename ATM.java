class ATM {
    public int countBanknotes(int sum){
        int[] banknotesList = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int index = 0;
        int count = 0;
        while (sum!=0){
            if (sum>=banknotesList[index]){
                sum-=banknotesList[index];
                count++;
            } else {

                index++;

            }
        }
        return count;
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        System.out.println("atm.countBanknotes(500) = " + atm.countBanknotes(500));
        System.out.println("atm.countBanknotes(512) = " + atm.countBanknotes(512));
        System.out.println("atm.countBanknotes(00) = " + atm.countBanknotes(00));
        System.out.println("atm.countBanknotes(50) = " + atm.countBanknotes(50));
    }
}
