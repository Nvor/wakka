package nvor.wakka.uploadservice.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("upload")
public class FileUploadController {
    @PostMapping
    public ResponseEntity<String> uploadFile(@RequestParam byte[] data) {
        if (data == null) {
            return ResponseEntity.badRequest().body("Error: No data found to upload");
        }

        //TODO: pass inner, do logic..

        return ResponseEntity.ok("Data uploaded.");
    }
}
