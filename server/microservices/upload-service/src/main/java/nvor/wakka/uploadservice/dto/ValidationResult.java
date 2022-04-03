package nvor.wakka.uploadservice.dto;

public class ValidationResult {
    private boolean valid;
    private String message;

    public ValidationResult() { }
    public ValidationResult(boolean valid) {
        this.valid = valid;
    }
    public ValidationResult(boolean valid, String message) {
        this.valid = valid;
        this.message = message;
    }

    public boolean isValid() {
        return this.valid;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
