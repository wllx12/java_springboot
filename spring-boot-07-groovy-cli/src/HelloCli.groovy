@Grab("org.springframework.boot:spring-boot-starter-thymeleaf:2.5.5")
@Grab("org.webjars:jquery:3.6.0")
@Controller
class HelloCli {
    @RequestMapping("/")
    String home(Model model) {
        model.addAttribute("name","123123")
        return "welcome"
    }
}