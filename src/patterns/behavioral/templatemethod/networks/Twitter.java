package patterns.behavioral.templatemethod.networks;

public class Twitter extends Network{
    public Twitter(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public boolean logIn(String userName, String password) {
        System.out.println("\nПроверка пользовательских данных");
        System.out.println("Имя: " + this.userName);
        System.out.print("Пароль: ");
        for (int i = 0; i < this.password.length(); i++) {
            System.out.print("*");
        }
        simulateNetworkLatency();
        System.out.println("\n\nУспешный вход в Twitter");
        return true;
    }

    public boolean sendData(byte[] data) {
        boolean messagePosted = true;
        if (messagePosted) {
            System.out.println("Сообщение: '" + new String(data) + "' было отправлено в Twitter");
            return true;
        } else {
            return false;
        }
    }

    public void logOut() {
        System.out.println("Пользователь: '" + userName + "' вышел из Twitter");
    }

    private void simulateNetworkLatency() {
        try {
            int i = 0;
            System.out.println();
            while (i < 10) {
                System.out.print(".");
                Thread.sleep(500);
                i++;
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
