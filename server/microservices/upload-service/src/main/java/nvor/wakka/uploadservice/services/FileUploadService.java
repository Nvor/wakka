package nvor.wakka.uploadservice.services;

import nvor.wakka.uploadservice.dto.FileDto;
import nvor.wakka.uploadservice.validators.FileValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

interface IFileUploadService
{
    boolean uploadFile(FileDto file);
}

@Service
public class FileUploadService implements IFileUploadService {
    @Autowired
    FileValidator fileValidator;

    public boolean uploadFile(FileDto file) {
        var fileValid = fileValidator.validateFile(file);

        if (fileValid.isValid()) {
            //TODO: implement rabbitmq client library
            //TODO: publish files to message bus
            //validate queued message result, return
        }

        return false;
    }
}
