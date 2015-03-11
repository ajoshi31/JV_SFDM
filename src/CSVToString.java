import java.util.ArrayList;


public class CSVToString {
   	
	static String SF_Data = "primaryEmail,contactEmail,firstName,middleName,lastName,cellPhone,homePhone,address,address2,city,state,zip,country,dateOfBirth,gender,ssn,disabilityStatus,preferredLoc,contactOtherPosition,comments,commentator,resume,Source";
    static String JV_Mapping="Email,Email,FirstName,middleName,LastName,Mobile,HomePhone,Address,address2,City,State,PostalCode,Country,dateOfBirth,Gender,ssn,disabilityStatus,Location,contactOtherPosition,comments,commentator,OriginalDocument,Source";
	static String SF_Columns[] = SF_Data.split(",");
    static String JV_Columns[] = JV_Mapping.split(",");
    
    static String JV_ReqData=JV_Mapping+"Source";
    
    static String SF_ReqData=SF_Data+"Source";
    
    static String[] getSFColumns() {
		return SF_Columns;
	}
    
    static String getSFData(){
    	return SF_Data;
    }
    
    static String[] getJVColumns(){
    	return JV_Columns;
    }
   //all hard coded mappings 
  }
