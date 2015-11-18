package expressions;

public enum Operation {

    PLUS("+", 0), MINUS("-", 0), MLT("*", 1), DIV("/", 1);

    private final String chars;
    private final int priority;

    private Operation(String chars, int priority) {
        this.chars = chars;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return getChars();
    }

    /**
     * @return the chars
     */
    public String getChars() {
        return chars;
    }

    /**
     * @return the priority
     */
    public int getPriority() {
        return priority;
    }

}
