/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.19).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger2.api;

import io.swagger2.model.Accuracy;
import io.swagger2.model.AnalyticsData;
import io.swagger2.model.EventFilter;
import io.swagger2.model.EventId;
import io.swagger2.model.EventReportingRequirement;
import io.swagger2.model.ExceptionId;
import io.swagger2.model.ExpectedAnalyticsType;
import io.swagger2.model.GroupId;
import io.swagger2.model.NFType;
import io.swagger2.model.NetworkAreaInfo;
import io.swagger2.model.NetworkPerfType;
import io.swagger2.model.NfInstanceId;
import io.swagger2.model.NsiId;
import io.swagger2.model.NsiIdInfo;
import io.swagger2.model.NsiLoadLevelInfo;
import io.swagger2.model.ProblemDetails;
import io.swagger2.model.Snssai;
import io.swagger2.model.Supi;
import io.swagger2.model.SupportedFeatures;
import io.swagger2.model.TargetUeInformation;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;

import java.util.regex.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import io.swagger.annotations.*;

import org.openjdk.jol.vm.VM;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-04T13:04:57.679821+03:00[Europe/Athens]")  
@Api(value = "analytics", description = "the analytics API")

public interface AnalyticsApi {

    Logger log = LoggerFactory.getLogger(AnalyticsApi.class);

    default Optional<ObjectMapper> getObjectMapper(){
    	
        return Optional.empty();
    }
    
    default Optional<HttpServletRequest> getRequest(){
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {    
        return getRequest().map(r -> r.getHeader("Accept"));
    }

    @ApiOperation(value = "Read a NWDAF Analytics", nickname = "getNWDAFAnalytics", notes = "", response = AnalyticsData.class, authorizations = {
        @Authorization(value = "oAuth2ClientCredentials", scopes = { 
            @AuthorizationScope(scope = "nnwdaf-analyticsinfo", description = "Access to the Nnwdaf_AnalyticsInfo API")
            })    }, tags={ "NWDAF Analytics (Document)", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Containing the analytics with parameters as relevant for the requesting NF service consumer.", response = AnalyticsData.class),
        @ApiResponse(code = 204, message = "No Content (The request NWDAF Analytics data does not exist)", response = ProblemDetails.class),
        @ApiResponse(code = 400, message = "Bad request", response = ProblemDetails.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ProblemDetails.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ProblemDetails.class),
        @ApiResponse(code = 404, message = "Indicates that the NWDAF Analytics resource does not exist.", response = ProblemDetails.class),
        @ApiResponse(code = 406, message = "406 Not Acceptable"),
        @ApiResponse(code = 414, message = "URI Too Long", response = ProblemDetails.class),
        @ApiResponse(code = 429, message = "Too Many Requests", response = ProblemDetails.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = ProblemDetails.class),
        @ApiResponse(code = 501, message = "Not Implemented", response = ProblemDetails.class),
        @ApiResponse(code = 503, message = "Service Unavailable", response = ProblemDetails.class),
        @ApiResponse(code = 200, message = "Generic Error") })
    @RequestMapping(value = "/analytics",
        produces = {  "application/json", "application/problem+json" },

        method = RequestMethod.GET )
    default ResponseEntity<AnalyticsData> getNWDAFAnalytics(@NotNull @ApiParam(value = "Identify the analytics.", required = true) @Valid @RequestParam(value = "event-id", required = true) EventId  eventId //String eventId 
,@ApiParam(value = "Identifies the analytics reporting requirement information.") @Valid @RequestParam(value = "ana-req", required = false)  String anaReq // EventReportingRequirement anaReq
,@ApiParam(value = "Identify the analytics.") @Valid @RequestParam(value = "event-filter", required = false)  String eventFilter //String eventFilter
,@ApiParam(value = "To filter irrelevant responses related to unsupported features") @Valid @RequestParam(value = "supported-features", required = false)  String supportedFeatures // SupportedFeatures supportedFeatures
,@ApiParam(value = "Identify the target UE information.") @Valid @RequestParam(value = "tgt-ue", required = false)  String tgtUe //String tgtUe
) {		
    	 

    	  if ( true ) {
    		 
//-----------------------------------------ana-req----------------------------------------    		  
    		  EventReportingRequirement analyticsReq = new EventReportingRequirement();
    		  Map<String, String> anaMap = null;
	    	  if(anaReq!=null) {
	    		  anaMap = new JsonToMap().jsonToMap(anaReq);
	    		  
	  	  		  analyticsReq.setAccuracy(new Accuracy(anaMap.get("accuracy"))); 
	  	  		  OffsetDateTime startTs = null;
	  	  		  if(anaMap.get("startTs") != null) {
	  	  			startTs = OffsetDateTime.parse(anaMap.get("startTs"), DateTimeFormatter.ISO_OFFSET_DATE_TIME);
	  	  		  }
	  	  		  analyticsReq.setStartTs(startTs);
	    		  
	    		  OffsetDateTime endTs = null;
	    		  if(anaMap.get("endTs") != null) {
	    			  endTs = OffsetDateTime.parse(anaMap.get("endTs"), DateTimeFormatter.ISO_OFFSET_DATE_TIME);
	  	  		  }
	  	  		  analyticsReq.setEndTs(endTs);
	    		  
	    		  OffsetDateTime timeAnaNeeded = null;
	    		  if(anaMap.get("timeAnaNeeded") != null) {
	    			  timeAnaNeeded = OffsetDateTime.parse(anaMap.get("timeAnaNeeded"), DateTimeFormatter.ISO_OFFSET_DATE_TIME);
	  	  		  }
	  	  		  analyticsReq.setTimeAnaNeeded(timeAnaNeeded);
	  	  		  
	    		  Integer sampRatio = null;
	    		  if(anaMap.get("sampRatio") != null) {
	    			  sampRatio = Integer.parseInt(anaMap.get("sampRatio"));
	    		  }
	    		  analyticsReq.setSampRatio(sampRatio);
	    		  
	    		  Integer maxObjectNbr = 1000000000;
	    		  if(anaMap.get("maxObjectNbr") != null) {
	    			  maxObjectNbr = Integer.parseInt(anaMap.get("maxObjectNbr"));
	    		  }
	    		  analyticsReq.setMaxObjectNbr(maxObjectNbr);
	    		  
	    		  Integer maxSupiNbr = 1000000000;
	    		  if(anaMap.get("maxSupiNbr") != null) {
	    			  maxSupiNbr = Integer.parseInt(anaMap.get("maxSupiNbr"));
	    		  }
	    		  analyticsReq.setMaxSupiNbr(maxSupiNbr);
	    	  }
//--------------------------------event-filter---------------------------------------------------------    		      		  
    		  EventFilter eventFilt = new EventFilter();
    		  Map<String, String> eventFilterMap = null;
    		  
    		  if (eventFilter!=null) {
				eventFilterMap = new JsonToMap().jsonToMap(eventFilter);
				List<String> appIdsList = null;
				if (eventFilterMap.get("appIds") != null) {
					appIdsList = new StringToList().stringToList(eventFilterMap.get("appIds"));
				}
				List<String> dnnsList = null;
				if (eventFilterMap.get("dnns") != null) {
					dnnsList = new StringToList().stringToList(eventFilterMap.get("dnns"));
				}
				List<String> dnaisList = null;
				if (eventFilterMap.get("dnais") != null) {
					dnaisList = new StringToList().stringToList(eventFilterMap.get("dnais"));
				}
				List<String> nfSetIdsList = null;
				if (eventFilterMap.get("nfSetIds") != null) {
					nfSetIdsList = new StringToList().stringToList(eventFilterMap.get("nfSetIds"));
				}
				List<UUID> nfInstanceIds = null;
				if (eventFilterMap.get("nfInstanceIds") != null) {
					nfInstanceIds = new StringToList().stringToUuidList(eventFilterMap.get("nfInstanceIds"));
				}
				List<NFType> nfTypes = null;
				if (eventFilterMap.get("nfTypes") != null) {
					nfTypes = new StringToList().stringToNfTypeList(eventFilterMap.get("nfTypes"));
				}
				// List<NetworkAreaInfo> networkAreaInfo = new StringToList().stringToNetworkAreaInfo(eventFilterMap.get("networkArea"));
				//List<NsiIdInfo> nsiIdInfoList = new StringToList().stringToNsiIdInfo((eventFilterMap.get("nsiIdInfos")));
				List<NetworkPerfType> nwPerfTypesList = null;
				if (eventFilterMap.get("nwPerfTypes") != null) {
					nwPerfTypesList = new StringToList().stringToNetworkPerfType(eventFilterMap.get("nwPerfTypes"));
				}
				List<ExceptionId> excepIdsList = null;
				if (eventFilterMap.get("excepIds") != null) {
					excepIdsList = new StringToList().stringToExceptionIds(eventFilterMap.get("excepIds"));
				}
				List<ExpectedAnalyticsType> exptAnaTypeList = null;
				if (eventFilterMap.get("exptAnaType") != null) {
					exptAnaTypeList = new StringToList().stringToExptAnaType(eventFilterMap.get("exptAnaType"));
				}
				ArrayList<NsiIdInfo> nsiIdInfosList = null;
				if (eventFilterMap.get("nsiIdInfos") != null) {
					nsiIdInfosList = new NsiIdInfo().stringToNsiIdInfos(eventFilterMap.get("nsiIdInfos"));
				}
				
				eventFilt.setNsiIdInfos(nsiIdInfosList);
				eventFilt.setExcepIds(excepIdsList);
				eventFilt.setNwPerfTypes(nwPerfTypesList);
				eventFilt.setNfInstanceIds(nfInstanceIds);
				eventFilt.setNfTypes(nfTypes);
				ArrayList<Snssai> snssais = null;
				if (eventFilterMap.get("snssais") != null) {
					snssais = Snssai.stringToSnssaiList(eventFilterMap.get("snssais"));
				}
				eventFilt.setSnssais(snssais);
				eventFilt.setAnySlice(Boolean.parseBoolean(eventFilterMap.get("anySlice")));
				eventFilt.setNfSetIds(nfSetIdsList);
				eventFilt.setDnais(dnaisList);
				eventFilt.setAppIds(appIdsList);
				eventFilt.setDnns(dnnsList);
			}
//-------------------------------------------supported-features---------------------------------------------------------------------
    		SupportedFeatures supportedFeats = null;
			if (supportedFeatures!=null) {
				supportedFeats = new SupportedFeatures("8");
				//	supportedFeats = new SupportedFeatures(supportedFeatures);
			}
    		  
//------------------------------------------------tgt-ue----------------------------------------------------------------------------
    		TargetUeInformation targetUe = new TargetUeInformation();
    		Map<String, String> targetUeMap = null;
    		if (tgtUe!=null) {
				targetUeMap = new JsonToMap().jsonToMap(tgtUe);
				if (targetUeMap.get("anyUe") != null) {
					targetUe.setAnyUe(Boolean.parseBoolean(targetUeMap.get("anyUe")));
				}
				if (targetUeMap.get("supis") != null) {
					List<String> supi = new Supi().stringToSupis(targetUeMap.get("supis"));
					targetUe.setSupis(supi);
				}
				if (targetUeMap.get("intGroupIds") != null) {
					List<String> groupId = new GroupId().stringToGroupIds(targetUeMap.get("intGroupIds"));
					targetUe.setIntGroupIds(groupId);
					//System.out.println(targetUe.getIntGroupIds());
				} 
			}
    		/*
    		---------------------------------------------------------------------------------------------------------------
			String command = "curl http://192.168.1.4:9090/api/v1/query?query=node_disk_flush_requests_time_seconds_total -o /home/gctz/Desktop/Diplwmatikh/Multi_TS/Analytics_info/prometheus_yaml_files/test.json";
    		Process process;
			try {
				process = Runtime.getRuntime().exec(command);
				process.getInputStream();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			---------------------------------------------------------------------------------------------------------------
			*/
    		ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
    		//mapper.configure(SerializationFeature.FAIL_ON_SELF_REFERENCES, false);
   		    mapper.findAndRegisterModules();
    		    
    		AnalyticsData ad = new AnalyticsData();
            ad.setTimeStampGen(OffsetDateTime.now());
                
            if (supportedFeats != null) {
				ad.setSuppFeat("{AbnormalBehaviour=" + supportedFeats.getAbnormalBehaviour()
				+ "; NetworkPerformance=" + supportedFeats.getNetworkPerformance() + "; NfLoad="
				+ supportedFeats.getNfLoad() + "; NsiLoad=" + supportedFeats.getNsiLoad()
				+ "; QoSSustainability=" + supportedFeats.getQoSSustainability()
				+ "; ServiceExperience=" + supportedFeats.getServiceExperience() + "; UeCommunication="
				+ supportedFeats.getUeCommunication() + "; UeMobility=" + supportedFeats.getUeMobility()
				+ "; UserDataCongestion=" + supportedFeats.getUserDataCongestion() + "}");
			}
			if (anaMap!=null) {
				if (analyticsReq.getStartTs() != null) {
					ad.setStart(analyticsReq.getStartTs());
				}
				if (analyticsReq.getEndTs() != null) {
					ad.setExpiry(analyticsReq.getEndTs());
				}
				if(ad.getStart()!=null && ad.getExpiry()!=null ) { //CHECKING START PRECEEDS EXPIRY
					if(ad.getStart().compareTo(ad.getExpiry())>0) {
						ad.setStart(null);
						ad.setExpiry(null);
					}
				}
				if (analyticsReq.getTimeAnaNeeded()!=null) {
					//int delay = OffsetDateTime.now().getSecond() - analyticsReq.getTimeAnaNeeded().getSecond();
					OffsetDateTime timeAnaNeeded = analyticsReq.getTimeAnaNeeded();
					OffsetDateTime currentTime = OffsetDateTime.now();
					
					if (timeAnaNeeded.compareTo(currentTime)>0) {
						int yearDif = timeAnaNeeded.getYear() - currentTime.getYear();
						//Convert the years difference into days difference + adding their daysDif into the year
						int totalDaysDif = yearDif*365 + (currentTime.getDayOfYear() - currentTime.getDayOfYear());
						//Taking into consideration the leap years
						if(timeAnaNeeded.getYear()/4==0 || yearDif>=4) {
							totalDaysDif = totalDaysDif+1;
						}
						if( currentTime.getYear()/4==0 ) {
							totalDaysDif = totalDaysDif-1;
						}
						//Convert daysDif into minutes and adding their hoursDif into the day
						int hoursDif = totalDaysDif*24 + ( timeAnaNeeded.getHour() - currentTime.getHour());
						//Convert hoursDif in minutesDif
						int minutesDif = hoursDif*60 + ( timeAnaNeeded.getMinute() - currentTime.getMinute());
						//Convert minutesDif into secDif and adding their seconds difference
						int delay = minutesDif*60 + ( timeAnaNeeded.getSecond() - currentTime.getSecond());
						//System.out.println("Current:"+currentTime+"   Needed:"+timeAnaNeeded+"	\nYearDif:"+yearDif+"	\ndaysDif:" + totalDaysDif+"	\nhourDif"+hoursDif+"	\nminutesDif"+minutesDif+"	\nsecondsDif"+delay);
						try {
							java.util.concurrent.TimeUnit.SECONDS.sleep(delay);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} 
					}
				}
			}
			if(eventId.name() == "LOAD_LEVEL_INFORMATION") {
				ad.setSliceLoadLevelInfos(null); 
				return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
			}
			else if(eventId.name() == "NETWORK_PERFORMANCE") {
				//ad.setNwPerfs(null);
				List<NetworkPerfType> givenNwPerfTypes = eventFilt.getNwPerfTypes();
				//System.out.println(givenNwPerfTypes.get(0).toString());
				for(int i=0; i<givenNwPerfTypes.size(); i++) {
					if(givenNwPerfTypes.get(i).toString().equals("NUM_OF_UE")  ) {
						//String command = "curl http://150.140.195.253:9090/api/v1/query?query=netdata_UE_STATS_GNODEB_bps_average -o /home/gctz/Desktop/Diplwmatikh/Multi_TS/Analytics_info/prometheus_yaml_files/test.json";
						String command = "curl http://150.140.195.253:9090/api/v1/query?query=netdata_UE_STATS_GNODEB_bps_average";
						Process process;
						String result = null;
						try {
							process = Runtime.getRuntime().exec(command);
							//process.getInputStream();
							result = new BufferedReader(
			                           new InputStreamReader(process.getInputStream()))
			                               .lines()
			                               .collect(Collectors.joining("\n"));
						} catch (IOException e) {
							e.printStackTrace();
						}
						String json = result;
						Object document = Configuration.defaultConfiguration().jsonProvider().parse(json);
						String query = "$.data.result[*].metric.chart";
						ArrayList<String> charts = JsonPath.read(document, query);
						ArrayList<String> chartsUnique = new ArrayList<String>();
						for(int j=0; j<charts.size(); j++) {
							String currentInfo = charts.get(j);
							String[] onlyUE = currentInfo.split("[.]");
							String currentUE = onlyUE[0];
							if(!chartsUnique.contains(currentUE)) {
								chartsUnique.add(currentUE);
							}
						}
						Integer numOfUEs = chartsUnique.size();
						System.out.println(numOfUEs);
					}
				
				}
				
				
				return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
			}
			else if(eventId.name() == "NF_LOAD") {
            	ad.setNfLoadLevelInfos(null);
            	return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
            }
			else if(eventId.name() == "SERVICE_EXPERIENCE") {
            	ad.setSvcExps(null);
            	return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
            }
			else if(eventId.name() == "UE_MOBILITY") {
            	ad.setUeMobs(null);
            	return new ResponseEntity<>( HttpStatus.NOT_IMPLEMENTED);
            }
			else if(eventId.name() == "UE_COMMUNICATION") {
            	ad.setUeComms(null);
            	return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
            }
			else if(eventId.name() == "QOS_SUSTAINABILITY") {
            	ad.setQosSustainInfos(null);
            	return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
            }
			else if(eventId.name() == "ABNORMAL_BEHAVIOUR") {
            	ad.setAbnorBehavrs(null);
            	return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
            }
			else if(eventId.name() == "USER_DATA_CONGESTION") {
            	ad.setUserDataCongInfos(null);
            	return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
            }
			else if(eventId.name() == "NSI_LOAD_LEVEL") {
            	List<NsiLoadLevelInfo> nsiLoadLevelInfos = new ArrayList<NsiLoadLevelInfo>();
            	if (eventFilt.getNsiIdInfos()==null && eventFilt.getAnySlice()!= true) {
            		return new ResponseEntity<>(ad , HttpStatus.NO_CONTENT);
            	}
            	else if(eventFilt.getAnySlice()== true) {
            		File folder = new File("/home/gctz/Desktop/data/");
            		File[] listOfFiles = folder.listFiles();
            		ArrayList<NsiIdInfo> allNsiIdInfos = new ArrayList<NsiIdInfo>();
            		for (int i = 0; i < listOfFiles.length; i++) {
            			String currentFile = listOfFiles[i].getName();
            			if(Snssai.checkSnssai(currentFile) != null){
            				ArrayList<String> nsiIds = NsiIdInfo.isFileOfNsiId(currentFile);
            				allNsiIdInfos.add(new NsiIdInfo(new Snssai(currentFile), nsiIds));
            			}
            		}
            		eventFilt.setNsiIdInfos(allNsiIdInfos);
            	}
            	           	
            	if(eventFilt.getNsiIdInfos()!=null) {
            		List<NsiIdInfo> givenNsiIdInfos = eventFilt.getNsiIdInfos();
            	//	System.out.println(givenNsiIdInfos.toString());
            		for(int i = 0; i<givenNsiIdInfos.size(); i++) {
            			Snssai currentSnssai = givenNsiIdInfos.get(i).getSnssai();
            			List<String> currentNsiIdsList = givenNsiIdInfos.get(i).getNsiIds();
            			if (currentNsiIdsList.isEmpty()) {
            				ArrayList<String> nsiIds = NsiIdInfo.isFileOfNsiId(currentSnssai.toString2());
            				givenNsiIdInfos.set(i, new NsiIdInfo(currentSnssai, nsiIds));
            				currentNsiIdsList = givenNsiIdInfos.get(i).getNsiIds();
            			}
            			if (currentNsiIdsList != null) {
							for (int j = 0; j < currentNsiIdsList.size(); j++) {
								String currentNsiId = currentNsiIdsList.get(j);
								if (analyticsReq.getStartTs() == null) {
									NsiLoadLevelInfo currentNsiLoadLevelInfo = new NsiLoadLevelInfo(currentSnssai, currentNsiId);
									if (currentNsiLoadLevelInfo.getLoadLevelInformation() > 100) {
										return new ResponseEntity<>(HttpStatus.NO_CONTENT);
									}
									nsiLoadLevelInfos.add(currentNsiLoadLevelInfo);
								} else if (analyticsReq.getStartTs() != null && analyticsReq.getEndTs() == null) {
									NsiLoadLevelInfo currentNsiLoadLevelInfo = new NsiLoadLevelInfo(currentSnssai, currentNsiId, analyticsReq.getStartTs());
									if (currentNsiLoadLevelInfo.getLoadLevelInformation() > 100) {
										return new ResponseEntity<>(HttpStatus.NO_CONTENT);
									}
									nsiLoadLevelInfos.add(currentNsiLoadLevelInfo);
								} else {
									NsiLoadLevelInfo currentNsiLoadLevelInfo = new NsiLoadLevelInfo(currentSnssai, currentNsiId, analyticsReq.getStartTs(), analyticsReq.getEndTs());
									if (currentNsiLoadLevelInfo.getLoadLevelInformation() > 100) {
										return new ResponseEntity<>(HttpStatus.NO_CONTENT);
									}
									nsiLoadLevelInfos.add(currentNsiLoadLevelInfo);
								}
							} 
						}
            		}
            	}
            	ad.setNsiLoadLevelInfos(nsiLoadLevelInfos);
            }
			return new ResponseEntity<>(ad, HttpStatus.OK);
    	  }
    	  return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

	
}
 
