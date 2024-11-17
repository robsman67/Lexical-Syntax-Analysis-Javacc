/* 
 * $Id$
 * 
 * Copyright (c) 2012-2021 Stephane GALLAND.
 * 
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package fr.utbm.info.da53.lw2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import fr.utbm.info.da53.lw2.parser.BasicParser;
import fr.utbm.info.da53.lw2.parser.ParseException;


/**
 * Interpreter of BASIC.
 * 
 * @author St&eacute;phane GALLAND &lt;stephane.galland@utbm.fr&gt;
 * @version $Name$ $Revision$ $Date$
 */
public class BasicInterpreter {
	
	/** Run the parser and the interpreter.
	 * 
	 * @param args
	 */

 public static void main(String[] args) throws ParseException, IOException {
        // Check if the user has provided a file argument
        if (args.length > 0) {
            // Parse from a file
            FileInputStream fileInputStream = new FileInputStream(args[0]);
            InputStreamReader reader = new InputStreamReader(fileInputStream);
            BufferedReader br = new BufferedReader(reader);

            // Initialize the parser with input from the file
        	BasicParser parser = new BasicParser(br);
            parser.start(); // Start parsing the input file

            System.out.println("Parsing completed successfully!");

            br.close(); // Don't forget to close the file reader
        } else {
            // Default: Read input from the console (System.in)
            BasicParser parser = new BasicParser(System.in);
            parser.start(); // Start parsing from console input

            System.out.println("Parsing completed successfully!");
        }
    }


	/*
	
	Code to excute !!

	public static void main(String args[]) {
		BasicParser parser;
		String filename;

		if(args.length == 0){
			System.out.println("Input your TinyBasic code:");
			parser = new BasicParser(System.in);
			filename = "Standard Input"; //$NON-NLS-1$
		}
		else if(args.length == 1){
			File f = new File(args[0]);
			try {
				parser = new BasicParser(new java.io.FileInputStream(f));
			}
			catch(java.io.FileNotFoundException e){
				e.printStackTrace();
				return ;
			}
			filename = f.getName();
		}
		else {
			return ;
		}
		SortedMap<Integer,Statement> code = null;
		try {
			code = parser.executeCompiler();
		}
		catch(LoggableException e) {
			ErrorRepository.add(e);
		}
		
		System.out.println("Running the code into the interpreter");
		DebugInterpreter debugContext = null;

		if (code!=null && !code.isEmpty()) {
			Interpreter interpreter = new LineBasedInterpreter(code, parser.getSymbolTable());
			try {
				debugContext = interpreter.debug();
			}
			catch (InterpreterException e) {
				ErrorRepository.add(e);
			}
		}
		
		InterpreterDialog dialog = new InterpreterDialog(filename, debugContext, !ErrorRepository.hasError());
		dialog.setVisible(true);
	}

	*/

}