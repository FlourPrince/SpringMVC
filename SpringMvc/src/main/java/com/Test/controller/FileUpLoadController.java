package com.Test.controller;

import java.io.File;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

@Controller
@RequestMapping("/user")
public class FileUpLoadController {
	/**
	 * 
	 * @Author pansw
	 *         <p>
	 *         <li>2020年3月3日-下午9:33:37</li>
	 *         <li>功能说明：传统方式上传文件</li>
	 *         </p>
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/fileupload1")
	public String fileupload(HttpServletRequest request) throws Exception {
		// 使用fileupload组件文件上传

		System.out.println("文件上传进来了");
		String pathString = request.getSession().getServletContext().getRealPath("/uploads");

		System.out.println(pathString);

		File file = new File(pathString);
		if (!file.exists()) {
			// 不存在 ，创建该文件
			file.mkdirs();
		}
		// 解析request对象，获取上传文件项
		DiskFileItemFactory factory = new DiskFileItemFactory();
		ServletFileUpload upload = new ServletFileUpload(factory);
		// 解析request
		List<FileItem> itmes = upload.parseRequest(request);
		System.out.println(itmes.toString());
		for (FileItem fileItem : itmes) {
			if (fileItem.isFormField()) {
				// 普通表单项
			}
			else {
				String filename = fileItem.getName();
				fileItem.write(new File(pathString, filename));
				// fileItem.delete();
			}
		}

		return "success";
	}

	/**
	 * 
	 * @Author pansw
	 *         <p>
	 *         <li>2020年3月3日-下午9:34:59</li>
	 *         <li>功能说明：SpringMVC方式上传文件</li>
	 *         </p>
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/fileupload2")
	public String fileupload2(HttpServletRequest request, MultipartFile upload) throws Exception {
		// 使用fileupload组件文件上传

		System.out.println("SpringMVC文件上传进来了");
		String pathString = request.getSession().getServletContext().getRealPath("/uploads");

		System.out.println(pathString);

		File file = new File(pathString);
		if (!file.exists()) {
			// 不存在 ，创建该文件
			file.mkdirs();
		}
		// 解析request对象，获取上传文件项
		String filename = upload.getOriginalFilename();
		String uuid = UUID.randomUUID().toString().replace("-", "");
		filename = uuid + filename;
		upload.transferTo(new File(pathString, filename));
		return "success";
	}
	/**
	 * 
	 * @Author pansw
	 *         <p>
	 *         <li>2020年3月3日-下午10:16:44</li>
	 *         <li>功能说明：跨服务器文件上传</li>
	 *         </p>
	 * @param request
	 * @param upload
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/fileupload3")
	public String fileupload3(MultipartFile upload) throws Exception {

		// 定义上传文件服务器的路劲
		String path = "http://localhost:9090/uploads/";

		// 解析request对象，获取上传文件项
		String filename = upload.getOriginalFilename();
		String uuid = UUID.randomUUID().toString().replace("-", "");
		filename = uuid + filename;
		Client client = Client.create();

		WebResource wb = client.resource(filename);

		wb.put(upload.getBytes());

		return "success";
	}
	
}
