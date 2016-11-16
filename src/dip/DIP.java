package dip;

public class DIP {

    public interface Worker {

        void work();

    }

    public class Human implements Worker {

        public void work() {
            // ...working
        }

    }

    public class Robot implements Worker {

        public void work() {
            // ...working much more
        }

    }

    public class Manager {

        private Worker worker;

        public void setWorker(Worker worker) {
            this.worker = worker;
        }
        public void manage() {
            worker.work();
        }

    }

}
