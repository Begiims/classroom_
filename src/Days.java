
    public  enum Days {
        MONDAY("I study java"),
        TUESDAY("I study English"),
        WEDNESDAY(" I read a book"),
        THURSDAY("I go to school"),
        FRIDAY("I study korean language"),
        SATURDAY(" I go to play football"),
        SUNDAY("Выходной");

        private final String days;

        Days(String days) {
            this.days = days;
        }

        public String getDays() {
            return days;
        }
    }


