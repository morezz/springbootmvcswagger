package com.groza.controller;

import com.groza.common.Result;
import com.groza.model.DemoEntity;
import com.groza.repository.DemoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.core.MediaType;

/**
 * HelloWorldController
 *
 * @author <a href="mailto:gzlin@coremail.cn">More</a>.
 */

@RequestMapping("/api")
@EnableAutoConfiguration
@RestController
@Api(value = "hello", description = "hello api", tags = "hello")
public class HelloWorldController {

    @Autowired
    private DemoRepository demoRepository;


    @ApiOperation(value = "获取用户信息", notes = "根据id获取用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long", paramType = "path"),
            @ApiImplicitParam(name = "name", value = "用户名", required = true, dataType = "String", paramType = "query")
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "Not found")
    }
    )
    @RequestMapping(value = "/hello/{id}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON})
    private Result hello(@PathVariable Long id, @RequestParam(name = "name", required = false) String name) {
        DemoEntity demoEntity = demoRepository.findOne(id);
        return new Result(0, "success", demoEntity);
    }

    @ApiOperation(value = "获取用户信息2", hidden = true)
    @RequestMapping(value = "/hello2/{id}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON})
    private Result hello2(@PathVariable Long id, @RequestParam(name = "name", required = false) String name) {
        DemoEntity demoEntity = demoRepository.findOne(id);
        return new Result(0, "success", demoEntity);
    }

}
