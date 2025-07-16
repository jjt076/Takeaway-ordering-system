import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/admin/setmeal")
@Slf4j
public class SetmealController {
    
    @Autowired // 确保 setmealService 正确注入
    private SetmealService setmealService;

    /**
     * 鏂板濂楅
     * @param setmealDTO
     * @return
     */
    @PostMapping
    @ApiOperation("鏂板濂楅")
    public Result save(@RequestBody SetmealDTO setmealDTO){
        log.info("鏂板濂楅锛歿}", setmealDTO);
        setmealService.saveWithDish(setmealDTO);
        return Result.success();
    }