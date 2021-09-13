package springmvcsearch;

import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {
	@RequestMapping("/fileform")
	public String showUploadForm() {

		return "fileform";
	}

	@RequestMapping(path = "/uploadimage", method = RequestMethod.POST)
//we have to save this file to server
	public String fileupload(@RequestParam("image") CommonsMultipartFile file, HttpSession session,Model m) {
		System.out.println("this is fileupload");
		System.out.println(file.getSize());
		System.out.println(file.getContentType());
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getStorageDescription());
		byte[] bytes = file.getBytes();
		try {

			String path = session.getServletContext().getRealPath("/") + "WEB-INF" + File.separator + "resources"
					+ File.separator + "image" + File.separator + file.getOriginalFilename();
			System.out.println(path);

			FileOutputStream fos = new FileOutputStream(path);
			fos.write(bytes);
			fos.close();
			System.out.println("file upload");
			m.addAttribute("filename", file.getOriginalFilename());
			m.addAttribute("msg", "file uploaded sucessfully");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("uploading error");
			m.addAttribute("msg", "file uploading error");

		}
		return "filesuccess";
	}
}
