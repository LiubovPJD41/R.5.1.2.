public class Worker {
    private OnTaskDoneListener callback;

    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback) {
        this.callback = callback;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 33) {
                errorCallback.onError("Task " + i + " is error");
            } else
                callback.onDone("Task " + i + " is done");
        }
    }


}
