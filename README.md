# springMVC_2
스프링 MVC 의 세부적인 기능들에 대한 학습 레포지토리입니다.

<h3>로깅</h3>
<p>로깅을 위한 객체 생성 및 호출하는 방법<br>로깅 단계 등에 대해 학습합니다.</p>
<ul>
  <li>Logger, LoggerFactory 객체 사용법</li>
  <li>@Slf4j 사용법</li>
  <li>trace, debug, info, warn, error</li>
  <li>log 호출 형식</li>
</ul>

<h3>http 요청 매핑</h3>
<p>클라이언트 요청을 매핑하는 방법에 대해 학습합니다.</p>
<ul>
  <li>@RequestMapping 사용법</li>
  <li>@GetMapping, @PostMapping, @PatchMapping, @PutMapping, @DeleteMapping, @HeadMapping 사용법</li>
  <li>@PathVariable 를 파라미터로 사용하는 법</li>
  <li>http 요청 API 구현</li>
</ul>

<h3>http 요청 메시지 처리</h3>
<ul>
  <li>요청 메시지에 담긴 파라미터를 조회하는 방법( HttpServletRequest , @RequestParam )에 대해 학습합니다.</li>
  <li>@ModelAttribute 사용법</li>
  <li>요청 메시지 자체를 응답으로 반환하는 방법( String으로 반환 , Json으로 반환 )에 대해 학습합니다.</li>
</ul>

<h3>http 응답 메시지 처리</h3>
<ul>
  <li>컨트롤러에서 처리한 데이터를 모델객체에 담아 뷰로 응답하는 방법( ModelAndView , Model 객체 사용 )</li>
  <li>컨트롤러에서 처리한 데이터를 모델객체에 담아 문자열로 응답하는 방법( HttpServletResponse , HttpEntity(ResponseEntity) , @ResponseBody 객체 사용 )</li>
  <li>컨트롤러에서 처리한 데이터를 모델객체에 담아 JSON으로 응답하는 방법( HttpEntity(ReponseEntity), @ResponseBody 객체 사용)</li>
</ul>
