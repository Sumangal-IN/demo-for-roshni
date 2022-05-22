package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class DemoController {

    @GetMapping(name = "/test1")
    public void test1(@RequestHeader String a) {
        System.out.println(a);
    }

    @GetMapping("/test2") // goes into value
    public void test2(@RequestHeader(name = "fruit") String a) {
        System.out.println(a);
    }

    @GetMapping("/test3")
    public void test3(@RequestHeader(required = false, name = "fruit") String a) {
        System.out.println(a);
    }

    @GetMapping("/test4")
    public void test4(@RequestHeader(required = false, name = "fruit", defaultValue = "banana") String a) {
        System.out.println(a);
    }

    @GetMapping("/test5")
    public void test5(@RequestHeader Map<String, String> a) {
        System.out.println(a.get("fruit"));
    }

    @GetMapping("/test6/{val}")
    public void test6(@PathVariable String val) {
        System.out.println(val);
    }

    @GetMapping("/test7/{fruit}")
    public void test7(@PathVariable("fruit") String val) {
        System.out.println(val);
    }

    @GetMapping("/test8/{fruit}/{furniture}")
    public void test8(@PathVariable(name="fruit", required = false) String val,
                      @PathVariable String furniture) {
        System.out.println(val);
        System.out.println(furniture);
    }

    @GetMapping("/test9")
    public void test9(@RequestBody Identity identity) {
        System.out.println(identity);
    }

    @GetMapping("/test10")
    public Identity test10(@RequestParam("fruit") String ss, @RequestBody Identity identity) {
        System.out.println(ss);
        System.out.println(identity);
        return identity;
    }
}
