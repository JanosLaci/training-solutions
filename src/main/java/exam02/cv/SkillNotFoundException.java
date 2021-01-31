package exam02.cv;

public class SkillNotFoundException extends RuntimeException {
    public SkillNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
