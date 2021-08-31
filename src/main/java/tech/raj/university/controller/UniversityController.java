package tech.raj.university.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import tech.raj.university.bean.OutputBean;
import tech.raj.university.bean.UniversityBean;
import tech.raj.university.service.UniversityService;

@RestController
@RequestMapping(value = "/university")
@Api(value = "UniversityController")
public class UniversityController {

	@Autowired
	UniversityService universityService;

	@ApiOperation(value = "Get list of university")
	@RequestMapping(path = "", method = RequestMethod.GET)
	public OutputBean<List<UniversityBean>> getUniversities() {
		return new OutputBean<>("data", universityService.getAll());
	}

	@ApiOperation(value = "Get university by id")
	@RequestMapping(path = "/{universityId}", method = RequestMethod.GET)
	public OutputBean<UniversityBean> getUniversity(@PathVariable("universityId") String universityId) {
		return new OutputBean<>("data", universityService.findById(universityId));
	}

	@ApiOperation(value = "save a university")
	@RequestMapping(path = "/save", method = RequestMethod.POST)
	public void saveUniversity(@RequestBody UniversityBean university) {
		universityService.save(university);
	}

}
