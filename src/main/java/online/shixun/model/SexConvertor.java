package online.shixun.model;

import javax.persistence.AttributeConverter;
import javax.persistence.Convert;

@Convert
public class SexConvertor implements AttributeConverter<Sex,String>  {

	@Override
	public String convertToDatabaseColumn(Sex attribute) {
		
		return attribute.getName();
	}

	@Override
	public Sex convertToEntityAttribute(String dbData) {
		
		return Sex.getSex(dbData);
	}



}
