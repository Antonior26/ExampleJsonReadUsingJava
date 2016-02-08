package deserialize;

import Gel_BioInf_Models.InterpretationRequestRD;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;

/**
 * Created by antonior on 08/02/16.
 */


public class desiarialize_example {

	public static JsonParser open(InputStream inputStream) throws IOException {
		JsonFactory factory = new JsonFactory();
		ObjectMapper jsonObjectMapper = new ObjectMapper(factory);
		jsonObjectMapper.configure(MapperFeature.REQUIRE_SETTERS_FOR_GETTERS, true);
		return factory.createParser(inputStream);
	}

	public static void main(String[] args) throws IOException {
		JsonParser parser = open(new FileInputStream(new File("/home/antonior/Intellij/GelModels/src/main/resources/example.json")));

		while (parser.nextToken() != null) {

			InterpretationRequestRD o = parser.readValueAs(InterpretationRequestRD.class);
			System.out.println(o);


		}
	}
}