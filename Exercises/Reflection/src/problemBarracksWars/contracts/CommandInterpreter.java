package problemBarracksWars.contracts;

import java.lang.reflect.InvocationTargetException;

public interface CommandInterpreter {

	Executable interpretCommand(String[] data, String commandName) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException;
}
