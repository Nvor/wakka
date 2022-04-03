package nvor.wakka.uploadservice.validators;

import nvor.wakka.uploadservice.dto.FileDto;
import nvor.wakka.uploadservice.dto.ValidationResult;
import org.springframework.stereotype.Component;

@Component
public class FileValidator {

    public ValidationResult validateFile(FileDto file) {
        var fileName = file.getFileName();
        if (fileName == null || fileName.isBlank()) {
            return new ValidationResult(false, "File name cannot be empty");
        }

        var fileData = file.getData();
        if (fileData == null || fileData.length == 0) {
            return new ValidationResult(false, "No file data provided");
        }

        return new ValidationResult(true);
    }
}
