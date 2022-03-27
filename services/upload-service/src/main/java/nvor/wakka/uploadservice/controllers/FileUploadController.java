package nvor.wakka.uploadservice.controllers;

import nvor.wakka.uploadservice.services.FileUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import nvor.wakka.uploadservice.dto.FileDto;

@RestController
@RequestMapping("upload")
public class FileUploadController {
    @Autowired
    FileUploadService fileUploadService;

    @GetMapping("/{id}")
    public ResponseEntity<FileDto> getFile(@PathVariable("id") int fileId) throws Exception {
        throw new Exception("GetById: To be implemented");
    }

    @GetMapping("/all")
    public ResponseEntity<FileDto[]> getAllFiles() throws Exception {
        throw new Exception("GetAll: To be implemented");
    }

    //@PostMapping
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<String> uploadFile(@RequestBody byte[] data) {
        if (data == null) {
            return ResponseEntity.badRequest().body("Error: No data found to upload");
        }

        FileDto file = new FileDto("test", data);
        var result = fileUploadService.uploadFile(file);

        if (!result) {
            return ResponseEntity.internalServerError().body("Error: Failed to upload data");
        }
        return ResponseEntity.ok("Data uploaded.");
    }
}
