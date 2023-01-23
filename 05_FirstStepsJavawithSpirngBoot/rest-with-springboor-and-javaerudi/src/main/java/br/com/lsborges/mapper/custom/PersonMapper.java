package br.com.lsborges.mapper.custom;

import java.util.Date;

import org.springframework.stereotype.Service;

import br.com.lsborges.data.vo.v2.PersonVOV2;
import br.com.lsborges.model.Person;

@Service
public class PersonMapper {
	
	public PersonVOV2 convertEntityToVo(Person entity) {
		PersonVOV2 vo = new PersonVOV2();
		vo.setId(entity.getId());
		vo.setAddress(entity.getAddress());
		vo.setBirthDay(new Date());
		vo.setGender(entity.getGender());
		vo.setLastName(entity.getLastName());
		vo.setFirstName(entity.getFirstName());
		return vo;
		
	}
	
	public Person convertVoToEntity(PersonVOV2 entity) {
		Person vo = new Person();
		vo.setId(entity.getId());
		vo.setAddress(entity.getAddress());
		//vo.setBirthDay(new Date());
		vo.setGender(entity.getGender());
		vo.setLastName(entity.getLastName());
		vo.setFirstName(entity.getFirstName());
		return vo;
		
	}

}
