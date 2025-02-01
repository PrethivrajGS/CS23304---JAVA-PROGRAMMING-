interface TimeClient {
    void updateTime(String currentTime);
}

class TimeServer {
    private TimeClient client;

    public void registerClient(TimeClient client) {
        this.client = client;
    }

    public void notifyTime() {
        String currentTime = java.time.LocalTime.now().toString();
        if (client != null) {
            client.updateTime(currentTime);
        }
    }
}

class MyTimeClient implements TimeClient {
    public void updateTime(String currentTime) {
        System.out.println("Current time updated: " + currentTime);
    }
}
class main {
    public static void main(String[] args) {
        TimeServer server = new TimeServer();
        MyTimeClient client = new MyTimeClient();

        server.registerClient(client);
        server.notifyTime();
    }
}
