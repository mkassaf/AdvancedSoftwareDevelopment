package edu.najah.cap.exception;

import edu.najah.cap.constraints.MyCnstraints;

public class Example {
	
	
	public int processData(Object data) throws DataProcessException{
		if(data == null) {
			throw new InvalidDataException("Invalid data!");
		}
		int status = MyCnstraints.READY_STATUS;
		if(status == MyCnstraints.DOWN_STATUS) {
			throw new DataProcessException("Processor is down");
		} 
		if(status == MyCnstraints.BUSY_STATUS) {
			throw new ProcessBusyExecption("Processor is busy, maybe try again");
		}
		if(status == MyCnstraints.READY_STATUS) {
			Processor.getInstance();
			try {
				Object objStatuse = Processor.analyze(data);
				if(objStatuse.equals(MyCnstraints.DONE_RESULT)) {
					return MyCnstraints.DONE_RESULT;
				} else {
					
					throw new DataProcessException("Failed to process the data");
				}
			} catch(Exception e) {
				System.out.println("Unexpected Error :: " + e.getMessage());
				throw new DataProcessException("Failed to process the data" + e.getMessage());
			} finally {
				System.out.println("Releasing the processor");
				Processor.release();
			}
			
		}
		throw new DataProcessException("The data was not processed ");
	}
	

}