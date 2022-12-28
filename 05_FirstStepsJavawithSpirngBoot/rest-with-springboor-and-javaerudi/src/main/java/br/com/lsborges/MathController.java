package br.com.lsborges;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.lsborges.exceptions.UnsupportedMathOperationException;
import br.com.lsborges.validation.IsNumber;

@RestController
public class MathController {
	IsNumber isNumber = new IsNumber();
	MathParam mtParam = new MathParam();
	
	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}",
			method=RequestMethod.GET)
	public Double sum(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
		) throws Exception{
		
		if(!IsNumber.isNumeric(numberOne) || !IsNumber.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		return mtParam.sum(IsNumber.covertToDouble(numberOne), IsNumber.covertToDouble(numberTwo));
	}
	
	@RequestMapping(value = "/sub/{numberOne}/{numberTwo}",
			method=RequestMethod.GET)
	public Double subtraction(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
			) throws Exception{
		
		if(!IsNumber.isNumeric(numberOne) || !IsNumber.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		return mtParam.sub(IsNumber.covertToDouble(numberOne), IsNumber.covertToDouble(numberTwo));
	}
	
	@RequestMapping(value = "/mult/{numberOne}/{numberTwo}",
			method=RequestMethod.GET)
	public Double multiplication(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
			) throws Exception{
		
		if(!IsNumber.isNumeric(numberOne) || !IsNumber.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		return mtParam.mult(IsNumber.covertToDouble(numberOne), IsNumber.covertToDouble(numberTwo));
	}
	
	@RequestMapping(value = "/div/{numberOne}/{numberTwo}",
			method=RequestMethod.GET)
	public Double division(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
			) throws Exception{
		
		if(!IsNumber.isNumeric(numberOne) || !IsNumber.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		return mtParam.div(IsNumber.covertToDouble(numberOne), IsNumber.covertToDouble(numberTwo));
	}

	@RequestMapping(value = "/media/{numberOne}/{numberTwo}",
			method=RequestMethod.GET)
	public Double mean(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
		) throws Exception{
		
		if(!IsNumber.isNumeric(numberOne) || !IsNumber.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		return mtParam.media(IsNumber.covertToDouble(numberOne), IsNumber.covertToDouble(numberTwo));
	}
	
	@RequestMapping(value = "/raiz/{number}",
			method=RequestMethod.GET)
	public Double squareRoot(
			@PathVariable(value = "number") String number
			) throws Exception{
		
		if(!IsNumber.isNumeric(number)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		return mtParam.raiz(IsNumber.covertToDouble(number));
	}
}