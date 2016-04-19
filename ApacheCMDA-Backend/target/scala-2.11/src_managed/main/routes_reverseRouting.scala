// @SOURCE:/sharedFolder/ApacheCMDA-Backend/conf/routes
// @HASH:979faf9401eebdb5ca18a6b17a9434b220ba43a9
// @DATE:Tue Apr 19 08:56:52 UTC 2016

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:129
// @LINE:128
// @LINE:127
// @LINE:126
// @LINE:125
// @LINE:123
// @LINE:122
// @LINE:117
// @LINE:113
// @LINE:112
// @LINE:111
// @LINE:110
// @LINE:106
// @LINE:105
// @LINE:101
// @LINE:100
// @LINE:99
// @LINE:98
// @LINE:95
// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:89
// @LINE:88
// @LINE:87
// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:59
// @LINE:58
// @LINE:56
// @LINE:54
// @LINE:53
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
package controllers {

// @LINE:117
class ReverseAssets {


// @LINE:117
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:106
// @LINE:105
class ReverseTagController {


// @LINE:106
def deleteTag(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "tag/deleteTag")
}
                        

// @LINE:105
def createTag(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "tag/createTag")
}
                        

}
                          

// @LINE:95
// @LINE:94
// @LINE:93
// @LINE:92
class ReverseMailController {


// @LINE:94
def getInbox(id:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "mail/getInbox/" + implicitly[PathBindable[Long]].unbind("id", id) + "/json")
}
                        

// @LINE:92
def sendMail(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "mail/sendMail")
}
                        

// @LINE:93
def readMail(mailId:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "mail/getMailDetail/mailId/" + implicitly[PathBindable[Long]].unbind("mailId", mailId))
}
                        

// @LINE:95
def getOutbox(id:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "mail/getOutbox/" + implicitly[PathBindable[Long]].unbind("id", id) + "/json")
}
                        

}
                          

// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
class ReverseInstrumentController {


// @LINE:25
def getAllInstruments(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "instrument/getAllInstruments/json")
}
                        

// @LINE:26
def getInstrument(id:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "instrument/getInstrument/id/" + implicitly[PathBindable[Long]].unbind("id", id) + "/json")
}
                        

// @LINE:27
def addInstrument(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "instrument/addInstrument")
}
                        

// @LINE:28
def updateInstrumentById(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "instrument/updateInstrument/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:29
def deleteInstrument(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "instrument/deleteInstrument/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

}
                          

// @LINE:123
// @LINE:122
// @LINE:89
// @LINE:88
// @LINE:87
// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
class ReverseWorkflowController {


// @LINE:80
def getWorkflowList(id:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "workflow/getWorkflowList/" + implicitly[PathBindable[Long]].unbind("id", id) + "/json")
}
                        

// @LINE:75
def post(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "workflow/post")
}
                        

// @LINE:86
def deleteTag(wfId:Long, tag:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "workflow/deleteTag/workflowId/" + implicitly[PathBindable[Long]].unbind("wfId", wfId) + "/tag/" + implicitly[PathBindable[String]].unbind("tag", dynamicString(tag)))
}
                        

// @LINE:78
def get(wfID:Long, userID:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "workflow/get/workflowID/" + implicitly[PathBindable[Long]].unbind("wfID", wfID) + "/userID/" + implicitly[PathBindable[Long]].unbind("userID", userID) + "/json")
}
                        

// @LINE:87
def getByTag(tag:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "workflow/getByTag/tag/" + implicitly[PathBindable[String]].unbind("tag", dynamicString(tag)))
}
                        

// @LINE:82
def getPublicWorkflow(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "workflow/getPublicWorkflow/json")
}
                        

// @LINE:81
def uploadImage(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "workflow/uploadImage/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:122
def addComment(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "workflow/addComment")
}
                        

// @LINE:88
def getByTitle(title:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "workflow/getByTitle/title/" + implicitly[PathBindable[String]].unbind("title", dynamicString(title)))
}
                        

// @LINE:79
def getTimeLine(id:Long, offset:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "workflow/getTimeline/" + implicitly[PathBindable[Long]].unbind("id", id) + "/offset/" + implicitly[PathBindable[Long]].unbind("offset", offset) + "/json")
}
                        

// @LINE:123
def getComments(workflowId:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "workflow/getComments/" + implicitly[PathBindable[Long]].unbind("workflowId", workflowId))
}
                        

// @LINE:89
def getTop3WorkFlow(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "workflow/getTop3WorkFlow")
}
                        

// @LINE:76
def updateWorkflow(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "workflow/updateWorkflow")
}
                        

// @LINE:77
def deleteWorkflow(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "workflow/deleteWorkflow")
}
                        

// @LINE:85
def setTag(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "workflow/setTag")
}
                        

// @LINE:84
def getTags(wfId:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "workflow/getTags/workflowId/" + implicitly[PathBindable[Long]].unbind("wfId", wfId))
}
                        

}
                          

// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:59
// @LINE:58
// @LINE:56
// @LINE:54
// @LINE:53
// @LINE:51
// @LINE:50
// @LINE:49
class ReverseUserController {


// @LINE:63
def getFollowers(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "users/getFollowers/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:70
def getFriends(userId:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "users/getFriends/userId/" + implicitly[PathBindable[Long]].unbind("userId", userId))
}
                        

// @LINE:68
def acceptFriendRequest(userId:Long, senderId:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "users/acceptFriendRequest/userId/" + implicitly[PathBindable[Long]].unbind("userId", userId) + "/sender/" + implicitly[PathBindable[Long]].unbind("senderId", senderId))
}
                        

// @LINE:64
def getFollowees(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "users/getFollowees/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:54
def userLogin(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "users/login")
}
                        

// @LINE:53
def userRegister(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "users/register")
}
                        

// @LINE:62
def userUnfollow(followerId:Long, followeeId:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "users/unfollow/followerId/" + implicitly[PathBindable[Long]].unbind("followerId", followerId) + "/followeeId/" + implicitly[PathBindable[Long]].unbind("followeeId", followeeId))
}
                        

// @LINE:50
def getAllUsers(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "users/getAllUsers/json")
}
                        

// @LINE:66
def sendFriendRequest(senderId:Long, receiverId:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "users/sendFriendRequest/sender/" + implicitly[PathBindable[Long]].unbind("senderId", senderId) + "/receiver/" + implicitly[PathBindable[Long]].unbind("receiverId", receiverId))
}
                        

// @LINE:49
def deleteUser(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "users/delete/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:67
def getFriendRequests(userId:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "users/getFriendRequests/userId/" + implicitly[PathBindable[Long]].unbind("userId", userId))
}
                        

// @LINE:56
def userSearch(display_name:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "users/search/" + implicitly[PathBindable[String]].unbind("display_name", dynamicString(display_name)) + "/json")
}
                        

// @LINE:61
def userFollow(followerId:Long, followeeId:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "users/follow/followerId/" + implicitly[PathBindable[Long]].unbind("followerId", followerId) + "/followeeId/" + implicitly[PathBindable[Long]].unbind("followeeId", followeeId))
}
                        

// @LINE:51
def deleteUserByUserNameandPassword(userName:String, password:String): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "users/delete/userName/" + implicitly[PathBindable[String]].unbind("userName", dynamicString(userName)) + "/password/" + implicitly[PathBindable[String]].unbind("password", dynamicString(password)))
}
                        

// @LINE:69
def rejectFriendRequest(userId:Long, senderId:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "users/rejectFriendRequest/userId/" + implicitly[PathBindable[Long]].unbind("userId", userId) + "/sender/" + implicitly[PathBindable[Long]].unbind("senderId", senderId))
}
                        

// @LINE:71
def deleteFriend(userId:Long, friendId:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "users/deleteFriend/userId/" + implicitly[PathBindable[Long]].unbind("userId", userId) + "/friendId/" + implicitly[PathBindable[Long]].unbind("friendId", friendId))
}
                        

// @LINE:59
def getProfile(id:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "users/getprofile/" + implicitly[PathBindable[Long]].unbind("id", id) + "/json")
}
                        

// @LINE:58
def setProfile(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "users/setprofile/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

}
                          

// @LINE:101
// @LINE:100
// @LINE:99
// @LINE:98
class ReverseSuggestionsController {


// @LINE:100
def voteToSuggestion(suggestionId:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "suggestion/voteToSuggestion/" + implicitly[PathBindable[Long]].unbind("suggestionId", suggestionId))
}
                        

// @LINE:99
def addTag(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "suggestion/addTag")
}
                        

// @LINE:101
def getSuggestionForWorkflow(workflowId:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "suggestion/getSuggestionForWorkflow/" + implicitly[PathBindable[Long]].unbind("workflowId", workflowId))
}
                        

// @LINE:98
def publishSuggestion(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "suggestion/publishSuggestion")
}
                        

}
                          

// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
class ReverseParameterController {


// @LINE:40
def getAllParameters(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "parameter/getAllParameters/json")
}
                        

// @LINE:42
def getParameterById(id:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "parameter/getParameter/id/" + implicitly[PathBindable[Long]].unbind("id", id) + "/json")
}
                        

// @LINE:44
def updateParameterById(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "parameter/updateParameter/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:41
def getParameterByName(id:Long, name:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "parameter/getParameter/service/" + implicitly[PathBindable[Long]].unbind("id", id) + "/name/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)) + "/json")
}
                        

// @LINE:45
def updateParameterByName(oldName:String): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "parameter/updateParameter/name/" + implicitly[PathBindable[String]].unbind("oldName", dynamicString(oldName)))
}
                        

// @LINE:46
def deleteParameterByName(id:Long, name:String): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "parameter/deleteParameter/service/" + implicitly[PathBindable[Long]].unbind("id", id) + "/name/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)))
}
                        

// @LINE:43
def addParameter(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "parameter/addParameter")
}
                        

}
                          

// @LINE:113
// @LINE:112
// @LINE:111
// @LINE:110
class ReverseGroupUsersController {


// @LINE:113
def getGroupMember(groupId:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "group/getGroupMember/" + implicitly[PathBindable[Long]].unbind("groupId", groupId) + "/json")
}
                        

// @LINE:112
def getGroupList(userID:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "group/getGroupList/" + implicitly[PathBindable[Long]].unbind("userID", userID) + "/json")
}
                        

// @LINE:110
def createGroup(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "group/createGroup")
}
                        

// @LINE:111
def addMembersToGroup(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "group/addMembersToGroup")
}
                        

}
                          

// @LINE:129
// @LINE:128
// @LINE:127
// @LINE:126
// @LINE:125
class ReverseCommentController {


// @LINE:128
def thumbUp(commentId:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "Comment/thumbUp/" + implicitly[PathBindable[Long]].unbind("commentId", commentId))
}
                        

// @LINE:129
def thumbDown(commentId:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "Comment/thumbDown/" + implicitly[PathBindable[Long]].unbind("commentId", commentId))
}
                        

// @LINE:125
def addReply(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "Comment/addReply")
}
                        

// @LINE:127
// @LINE:126
def getReply(commentId:Long): Call = {
   (commentId: @unchecked) match {
// @LINE:126
case (commentId)  =>
  import ReverseRouteContext.empty
  Call("GET", _prefix + { _defaultPrefix } + "Comment/getReply/" + implicitly[PathBindable[Long]].unbind("commentId", commentId))
                                         
   }
}
                                                

}
                          

// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
class ReverseDatasetController {


// @LINE:33
def getDataset(id:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "dataset/getDataset/id/" + implicitly[PathBindable[Long]].unbind("id", id) + "/json")
}
                        

// @LINE:32
def getAllDatasets(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "dataset/getAllDatasets/json")
}
                        

// @LINE:37
def queryDatasets(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "dataset/queryDataset")
}
                        

// @LINE:36
def deleteDataset(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "dataset/deleteDataset/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:34
def addDataset(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "dataset/addDataset")
}
                        

// @LINE:35
def updateDatasetById(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "dataset/updateDataset/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

}
                          

// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
class ReverseClimateServiceController {


// @LINE:13
def getAllClimateServicesOrderByCreateTime(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "climateService/getAllMostRecentClimateServicesByCreateTime/json")
}
                        

// @LINE:21
def deleteClimateServiceById(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "climateService/deleteClimateService/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:15
def getAllClimateServicesOrderByCount(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "climateService/getAllMostUsedClimateServices/json")
}
                        

// @LINE:18
def addServiceEntry(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "climateService/addServiceEntry")
}
                        

// @LINE:16
def addClimateService(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "climateService/addClimateService")
}
                        

// @LINE:12
def getAllClimateServices(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "climateService/getAllClimateServices/json")
}
                        

// @LINE:10
def getClimateService(name:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "climateService/getClimateService/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)) + "/json")
}
                        

// @LINE:19
def updateClimateServiceById(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "climateService/updateClimateService/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:11
def getClimateServiceById(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "climateService/getClimateService/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:14
def getAllClimateServicesOrderByLatestAccessTime(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "climateService/getAllMostRecentClimateServicesByLatestAccessTime/json")
}
                        

// @LINE:17
def getAllServiceEntries(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "climateService/getAllServiceEntries/json")
}
                        

// @LINE:20
def updateClimateServiceByName(oldName:String): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "climateService/updateClimateService/name/" + implicitly[PathBindable[String]].unbind("oldName", dynamicString(oldName)))
}
                        

// @LINE:22
def deleteClimateServiceByName(name:String): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "climateService/deleteClimateService/name/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)))
}
                        

}
                          
}
                  


// @LINE:129
// @LINE:128
// @LINE:127
// @LINE:126
// @LINE:125
// @LINE:123
// @LINE:122
// @LINE:117
// @LINE:113
// @LINE:112
// @LINE:111
// @LINE:110
// @LINE:106
// @LINE:105
// @LINE:101
// @LINE:100
// @LINE:99
// @LINE:98
// @LINE:95
// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:89
// @LINE:88
// @LINE:87
// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:59
// @LINE:58
// @LINE:56
// @LINE:54
// @LINE:53
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:117
class ReverseAssets {


// @LINE:117
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:106
// @LINE:105
class ReverseTagController {


// @LINE:106
def deleteTag : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TagController.deleteTag",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tag/deleteTag"})
      }
   """
)
                        

// @LINE:105
def createTag : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TagController.createTag",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tag/createTag"})
      }
   """
)
                        

}
              

// @LINE:95
// @LINE:94
// @LINE:93
// @LINE:92
class ReverseMailController {


// @LINE:94
def getInbox : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MailController.getInbox",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mail/getInbox/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/json"})
      }
   """
)
                        

// @LINE:92
def sendMail : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MailController.sendMail",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "mail/sendMail"})
      }
   """
)
                        

// @LINE:93
def readMail : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MailController.readMail",
   """
      function(mailId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mail/getMailDetail/mailId/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("mailId", mailId)})
      }
   """
)
                        

// @LINE:95
def getOutbox : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MailController.getOutbox",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mail/getOutbox/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/json"})
      }
   """
)
                        

}
              

// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
class ReverseInstrumentController {


// @LINE:25
def getAllInstruments : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.InstrumentController.getAllInstruments",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "instrument/getAllInstruments/json"})
      }
   """
)
                        

// @LINE:26
def getInstrument : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.InstrumentController.getInstrument",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "instrument/getInstrument/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/json"})
      }
   """
)
                        

// @LINE:27
def addInstrument : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.InstrumentController.addInstrument",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "instrument/addInstrument"})
      }
   """
)
                        

// @LINE:28
def updateInstrumentById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.InstrumentController.updateInstrumentById",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "instrument/updateInstrument/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:29
def deleteInstrument : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.InstrumentController.deleteInstrument",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "instrument/deleteInstrument/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              

// @LINE:123
// @LINE:122
// @LINE:89
// @LINE:88
// @LINE:87
// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
class ReverseWorkflowController {


// @LINE:80
def getWorkflowList : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.getWorkflowList",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/getWorkflowList/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/json"})
      }
   """
)
                        

// @LINE:75
def post : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.post",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/post"})
      }
   """
)
                        

// @LINE:86
def deleteTag : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.deleteTag",
   """
      function(wfId,tag) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/deleteTag/workflowId/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("wfId", wfId) + "/tag/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("tag", encodeURIComponent(tag))})
      }
   """
)
                        

// @LINE:78
def get : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.get",
   """
      function(wfID,userID) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/get/workflowID/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("wfID", wfID) + "/userID/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("userID", userID) + "/json"})
      }
   """
)
                        

// @LINE:87
def getByTag : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.getByTag",
   """
      function(tag) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/getByTag/tag/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("tag", encodeURIComponent(tag))})
      }
   """
)
                        

// @LINE:82
def getPublicWorkflow : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.getPublicWorkflow",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/getPublicWorkflow/json"})
      }
   """
)
                        

// @LINE:81
def uploadImage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.uploadImage",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/uploadImage/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:122
def addComment : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.addComment",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/addComment"})
      }
   """
)
                        

// @LINE:88
def getByTitle : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.getByTitle",
   """
      function(title) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/getByTitle/title/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("title", encodeURIComponent(title))})
      }
   """
)
                        

// @LINE:79
def getTimeLine : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.getTimeLine",
   """
      function(id,offset) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/getTimeline/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/offset/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("offset", offset) + "/json"})
      }
   """
)
                        

// @LINE:123
def getComments : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.getComments",
   """
      function(workflowId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/getComments/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("workflowId", workflowId)})
      }
   """
)
                        

// @LINE:89
def getTop3WorkFlow : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.getTop3WorkFlow",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/getTop3WorkFlow"})
      }
   """
)
                        

// @LINE:76
def updateWorkflow : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.updateWorkflow",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/updateWorkflow"})
      }
   """
)
                        

// @LINE:77
def deleteWorkflow : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.deleteWorkflow",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/deleteWorkflow"})
      }
   """
)
                        

// @LINE:85
def setTag : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.setTag",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/setTag"})
      }
   """
)
                        

// @LINE:84
def getTags : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.getTags",
   """
      function(wfId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/getTags/workflowId/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("wfId", wfId)})
      }
   """
)
                        

}
              

// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:59
// @LINE:58
// @LINE:56
// @LINE:54
// @LINE:53
// @LINE:51
// @LINE:50
// @LINE:49
class ReverseUserController {


// @LINE:63
def getFollowers : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.getFollowers",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/getFollowers/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:70
def getFriends : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.getFriends",
   """
      function(userId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/getFriends/userId/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("userId", userId)})
      }
   """
)
                        

// @LINE:68
def acceptFriendRequest : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.acceptFriendRequest",
   """
      function(userId,senderId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/acceptFriendRequest/userId/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("userId", userId) + "/sender/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("senderId", senderId)})
      }
   """
)
                        

// @LINE:64
def getFollowees : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.getFollowees",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/getFollowees/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:54
def userLogin : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.userLogin",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users/login"})
      }
   """
)
                        

// @LINE:53
def userRegister : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.userRegister",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users/register"})
      }
   """
)
                        

// @LINE:62
def userUnfollow : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.userUnfollow",
   """
      function(followerId,followeeId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/unfollow/followerId/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("followerId", followerId) + "/followeeId/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("followeeId", followeeId)})
      }
   """
)
                        

// @LINE:50
def getAllUsers : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.getAllUsers",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/getAllUsers/json"})
      }
   """
)
                        

// @LINE:66
def sendFriendRequest : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.sendFriendRequest",
   """
      function(senderId,receiverId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/sendFriendRequest/sender/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("senderId", senderId) + "/receiver/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("receiverId", receiverId)})
      }
   """
)
                        

// @LINE:49
def deleteUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.deleteUser",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "users/delete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:67
def getFriendRequests : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.getFriendRequests",
   """
      function(userId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/getFriendRequests/userId/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("userId", userId)})
      }
   """
)
                        

// @LINE:56
def userSearch : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.userSearch",
   """
      function(display_name) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/search/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("display_name", encodeURIComponent(display_name)) + "/json"})
      }
   """
)
                        

// @LINE:61
def userFollow : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.userFollow",
   """
      function(followerId,followeeId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/follow/followerId/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("followerId", followerId) + "/followeeId/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("followeeId", followeeId)})
      }
   """
)
                        

// @LINE:51
def deleteUserByUserNameandPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.deleteUserByUserNameandPassword",
   """
      function(userName,password) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "users/delete/userName/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("userName", encodeURIComponent(userName)) + "/password/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("password", encodeURIComponent(password))})
      }
   """
)
                        

// @LINE:69
def rejectFriendRequest : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.rejectFriendRequest",
   """
      function(userId,senderId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/rejectFriendRequest/userId/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("userId", userId) + "/sender/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("senderId", senderId)})
      }
   """
)
                        

// @LINE:71
def deleteFriend : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.deleteFriend",
   """
      function(userId,friendId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/deleteFriend/userId/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("userId", userId) + "/friendId/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("friendId", friendId)})
      }
   """
)
                        

// @LINE:59
def getProfile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.getProfile",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/getprofile/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/json"})
      }
   """
)
                        

// @LINE:58
def setProfile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.setProfile",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "users/setprofile/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              

// @LINE:101
// @LINE:100
// @LINE:99
// @LINE:98
class ReverseSuggestionsController {


// @LINE:100
def voteToSuggestion : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SuggestionsController.voteToSuggestion",
   """
      function(suggestionId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "suggestion/voteToSuggestion/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("suggestionId", suggestionId)})
      }
   """
)
                        

// @LINE:99
def addTag : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SuggestionsController.addTag",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "suggestion/addTag"})
      }
   """
)
                        

// @LINE:101
def getSuggestionForWorkflow : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SuggestionsController.getSuggestionForWorkflow",
   """
      function(workflowId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "suggestion/getSuggestionForWorkflow/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("workflowId", workflowId)})
      }
   """
)
                        

// @LINE:98
def publishSuggestion : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SuggestionsController.publishSuggestion",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "suggestion/publishSuggestion"})
      }
   """
)
                        

}
              

// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
class ReverseParameterController {


// @LINE:40
def getAllParameters : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ParameterController.getAllParameters",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "parameter/getAllParameters/json"})
      }
   """
)
                        

// @LINE:42
def getParameterById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ParameterController.getParameterById",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "parameter/getParameter/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/json"})
      }
   """
)
                        

// @LINE:44
def updateParameterById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ParameterController.updateParameterById",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "parameter/updateParameter/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:41
def getParameterByName : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ParameterController.getParameterByName",
   """
      function(id,name) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "parameter/getParameter/service/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/name/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name)) + "/json"})
      }
   """
)
                        

// @LINE:45
def updateParameterByName : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ParameterController.updateParameterByName",
   """
      function(oldName) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "parameter/updateParameter/name/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("oldName", encodeURIComponent(oldName))})
      }
   """
)
                        

// @LINE:46
def deleteParameterByName : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ParameterController.deleteParameterByName",
   """
      function(id,name) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "parameter/deleteParameter/service/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/name/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name))})
      }
   """
)
                        

// @LINE:43
def addParameter : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ParameterController.addParameter",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "parameter/addParameter"})
      }
   """
)
                        

}
              

// @LINE:113
// @LINE:112
// @LINE:111
// @LINE:110
class ReverseGroupUsersController {


// @LINE:113
def getGroupMember : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.GroupUsersController.getGroupMember",
   """
      function(groupId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "group/getGroupMember/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("groupId", groupId) + "/json"})
      }
   """
)
                        

// @LINE:112
def getGroupList : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.GroupUsersController.getGroupList",
   """
      function(userID) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "group/getGroupList/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("userID", userID) + "/json"})
      }
   """
)
                        

// @LINE:110
def createGroup : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.GroupUsersController.createGroup",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "group/createGroup"})
      }
   """
)
                        

// @LINE:111
def addMembersToGroup : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.GroupUsersController.addMembersToGroup",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "group/addMembersToGroup"})
      }
   """
)
                        

}
              

// @LINE:129
// @LINE:128
// @LINE:127
// @LINE:126
// @LINE:125
class ReverseCommentController {


// @LINE:128
def thumbUp : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CommentController.thumbUp",
   """
      function(commentId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Comment/thumbUp/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("commentId", commentId)})
      }
   """
)
                        

// @LINE:129
def thumbDown : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CommentController.thumbDown",
   """
      function(commentId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Comment/thumbDown/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("commentId", commentId)})
      }
   """
)
                        

// @LINE:125
def addReply : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CommentController.addReply",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "Comment/addReply"})
      }
   """
)
                        

// @LINE:127
// @LINE:126
def getReply : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CommentController.getReply",
   """
      function(commentId) {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Comment/getReply/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("commentId", commentId)})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Comment/getReply/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("commentId", commentId)})
      }
      }
   """
)
                        

}
              

// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
class ReverseDatasetController {


// @LINE:33
def getDataset : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.getDataset",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dataset/getDataset/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/json"})
      }
   """
)
                        

// @LINE:32
def getAllDatasets : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.getAllDatasets",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dataset/getAllDatasets/json"})
      }
   """
)
                        

// @LINE:37
def queryDatasets : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.queryDatasets",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "dataset/queryDataset"})
      }
   """
)
                        

// @LINE:36
def deleteDataset : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.deleteDataset",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "dataset/deleteDataset/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:34
def addDataset : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.addDataset",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "dataset/addDataset"})
      }
   """
)
                        

// @LINE:35
def updateDatasetById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.updateDatasetById",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "dataset/updateDataset/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              

// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
class ReverseClimateServiceController {


// @LINE:13
def getAllClimateServicesOrderByCreateTime : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.getAllClimateServicesOrderByCreateTime",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/getAllMostRecentClimateServicesByCreateTime/json"})
      }
   """
)
                        

// @LINE:21
def deleteClimateServiceById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.deleteClimateServiceById",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/deleteClimateService/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:15
def getAllClimateServicesOrderByCount : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.getAllClimateServicesOrderByCount",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/getAllMostUsedClimateServices/json"})
      }
   """
)
                        

// @LINE:18
def addServiceEntry : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.addServiceEntry",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/addServiceEntry"})
      }
   """
)
                        

// @LINE:16
def addClimateService : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.addClimateService",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/addClimateService"})
      }
   """
)
                        

// @LINE:12
def getAllClimateServices : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.getAllClimateServices",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/getAllClimateServices/json"})
      }
   """
)
                        

// @LINE:10
def getClimateService : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.getClimateService",
   """
      function(name) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/getClimateService/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name)) + "/json"})
      }
   """
)
                        

// @LINE:19
def updateClimateServiceById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.updateClimateServiceById",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/updateClimateService/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:11
def getClimateServiceById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.getClimateServiceById",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/getClimateService/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:14
def getAllClimateServicesOrderByLatestAccessTime : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.getAllClimateServicesOrderByLatestAccessTime",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/getAllMostRecentClimateServicesByLatestAccessTime/json"})
      }
   """
)
                        

// @LINE:17
def getAllServiceEntries : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.getAllServiceEntries",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/getAllServiceEntries/json"})
      }
   """
)
                        

// @LINE:20
def updateClimateServiceByName : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.updateClimateServiceByName",
   """
      function(oldName) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/updateClimateService/name/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("oldName", encodeURIComponent(oldName))})
      }
   """
)
                        

// @LINE:22
def deleteClimateServiceByName : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.deleteClimateServiceByName",
   """
      function(name) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/deleteClimateService/name/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name))})
      }
   """
)
                        

}
              
}
        


// @LINE:129
// @LINE:128
// @LINE:127
// @LINE:126
// @LINE:125
// @LINE:123
// @LINE:122
// @LINE:117
// @LINE:113
// @LINE:112
// @LINE:111
// @LINE:110
// @LINE:106
// @LINE:105
// @LINE:101
// @LINE:100
// @LINE:99
// @LINE:98
// @LINE:95
// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:89
// @LINE:88
// @LINE:87
// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:59
// @LINE:58
// @LINE:56
// @LINE:54
// @LINE:53
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
package controllers.ref {


// @LINE:117
class ReverseAssets {


// @LINE:117
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:106
// @LINE:105
class ReverseTagController {


// @LINE:106
def deleteTag(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.TagController]).deleteTag(), HandlerDef(this.getClass.getClassLoader, "", "controllers.TagController", "deleteTag", Seq(), "POST", """""", _prefix + """tag/deleteTag""")
)
                      

// @LINE:105
def createTag(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.TagController]).createTag(), HandlerDef(this.getClass.getClassLoader, "", "controllers.TagController", "createTag", Seq(), "POST", """ Tag
input:String tag""", _prefix + """tag/createTag""")
)
                      

}
                          

// @LINE:95
// @LINE:94
// @LINE:93
// @LINE:92
class ReverseMailController {


// @LINE:94
def getInbox(id:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.MailController]).getInbox(id, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.MailController", "getInbox", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """mail/getInbox/$id<[^/]+>/json""")
)
                      

// @LINE:92
def sendMail(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.MailController]).sendMail(), HandlerDef(this.getClass.getClassLoader, "", "controllers.MailController", "sendMail", Seq(), "POST", """ Mail""", _prefix + """mail/sendMail""")
)
                      

// @LINE:93
def readMail(mailId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.MailController]).readMail(mailId), HandlerDef(this.getClass.getClassLoader, "", "controllers.MailController", "readMail", Seq(classOf[Long]), "GET", """""", _prefix + """mail/getMailDetail/mailId/$mailId<[^/]+>""")
)
                      

// @LINE:95
def getOutbox(id:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.MailController]).getOutbox(id, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.MailController", "getOutbox", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """mail/getOutbox/$id<[^/]+>/json""")
)
                      

}
                          

// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
class ReverseInstrumentController {


// @LINE:25
def getAllInstruments(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).getAllInstruments(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.InstrumentController", "getAllInstruments", Seq(classOf[String]), "GET", """ Instrument""", _prefix + """instrument/getAllInstruments/json""")
)
                      

// @LINE:26
def getInstrument(id:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).getInstrument(id, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.InstrumentController", "getInstrument", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """instrument/getInstrument/id/$id<[^/]+>/json""")
)
                      

// @LINE:27
def addInstrument(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).addInstrument(), HandlerDef(this.getClass.getClassLoader, "", "controllers.InstrumentController", "addInstrument", Seq(), "POST", """""", _prefix + """instrument/addInstrument""")
)
                      

// @LINE:28
def updateInstrumentById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).updateInstrumentById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.InstrumentController", "updateInstrumentById", Seq(classOf[Long]), "PUT", """""", _prefix + """instrument/updateInstrument/id/$id<[^/]+>""")
)
                      

// @LINE:29
def deleteInstrument(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).deleteInstrument(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.InstrumentController", "deleteInstrument", Seq(classOf[Long]), "DELETE", """""", _prefix + """instrument/deleteInstrument/id/$id<[^/]+>""")
)
                      

}
                          

// @LINE:123
// @LINE:122
// @LINE:89
// @LINE:88
// @LINE:87
// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
class ReverseWorkflowController {


// @LINE:80
def getWorkflowList(id:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getWorkflowList(id, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "getWorkflowList", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """workflow/getWorkflowList/$id<[^/]+>/json""")
)
                      

// @LINE:75
def post(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).post(), HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "post", Seq(), "POST", """ Workflow""", _prefix + """workflow/post""")
)
                      

// @LINE:86
def deleteTag(wfId:Long, tag:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).deleteTag(wfId, tag), HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "deleteTag", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """workflow/deleteTag/workflowId/$wfId<[^/]+>/tag/$tag<[^/]+>""")
)
                      

// @LINE:78
def get(wfID:Long, userID:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).get(wfID, userID, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "get", Seq(classOf[Long], classOf[Long], classOf[String]), "GET", """""", _prefix + """workflow/get/workflowID/$wfID<[^/]+>/userID/$userID<[^/]+>/json""")
)
                      

// @LINE:87
def getByTag(tag:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getByTag(tag), HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "getByTag", Seq(classOf[String]), "GET", """""", _prefix + """workflow/getByTag/tag/$tag<[^/]+>""")
)
                      

// @LINE:82
def getPublicWorkflow(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getPublicWorkflow(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "getPublicWorkflow", Seq(classOf[String]), "GET", """""", _prefix + """workflow/getPublicWorkflow/json""")
)
                      

// @LINE:81
def uploadImage(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).uploadImage(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "uploadImage", Seq(classOf[Long]), "POST", """""", _prefix + """workflow/uploadImage/$id<[^/]+>""")
)
                      

// @LINE:122
def addComment(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).addComment(), HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "addComment", Seq(), "POST", """Workflow
GET            /workflow/getTimeline/:id/offset/:offset/json                                              @controllers.UserController.userSearch(id: Long, offset: Long, format: String="json")""", _prefix + """workflow/addComment""")
)
                      

// @LINE:88
def getByTitle(title:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getByTitle(title), HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "getByTitle", Seq(classOf[String]), "GET", """""", _prefix + """workflow/getByTitle/title/$title<[^/]+>""")
)
                      

// @LINE:79
def getTimeLine(id:Long, offset:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getTimeLine(id, offset, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "getTimeLine", Seq(classOf[Long], classOf[Long], classOf[String]), "GET", """""", _prefix + """workflow/getTimeline/$id<[^/]+>/offset/$offset<[^/]+>/json""")
)
                      

// @LINE:123
def getComments(workflowId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getComments(workflowId), HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "getComments", Seq(classOf[Long]), "GET", """""", _prefix + """workflow/getComments/$workflowId<[^/]+>""")
)
                      

// @LINE:89
def getTop3WorkFlow(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getTop3WorkFlow(), HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "getTop3WorkFlow", Seq(), "GET", """""", _prefix + """workflow/getTop3WorkFlow""")
)
                      

// @LINE:76
def updateWorkflow(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).updateWorkflow(), HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "updateWorkflow", Seq(), "POST", """""", _prefix + """workflow/updateWorkflow""")
)
                      

// @LINE:77
def deleteWorkflow(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).deleteWorkflow(), HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "deleteWorkflow", Seq(), "POST", """""", _prefix + """workflow/deleteWorkflow""")
)
                      

// @LINE:85
def setTag(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).setTag(), HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "setTag", Seq(), "POST", """""", _prefix + """workflow/setTag""")
)
                      

// @LINE:84
def getTags(wfId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getTags(wfId), HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "getTags", Seq(classOf[Long]), "GET", """""", _prefix + """workflow/getTags/workflowId/$wfId<[^/]+>""")
)
                      

}
                          

// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:59
// @LINE:58
// @LINE:56
// @LINE:54
// @LINE:53
// @LINE:51
// @LINE:50
// @LINE:49
class ReverseUserController {


// @LINE:63
def getFollowers(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getFollowers(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "getFollowers", Seq(classOf[Long]), "GET", """""", _prefix + """users/getFollowers/$id<[^/]+>""")
)
                      

// @LINE:70
def getFriends(userId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getFriends(userId), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "getFriends", Seq(classOf[Long]), "GET", """""", _prefix + """users/getFriends/userId/$userId<[^/]+>""")
)
                      

// @LINE:68
def acceptFriendRequest(userId:Long, senderId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).acceptFriendRequest(userId, senderId), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "acceptFriendRequest", Seq(classOf[Long], classOf[Long]), "GET", """""", _prefix + """users/acceptFriendRequest/userId/$userId<[^/]+>/sender/$senderId<[^/]+>""")
)
                      

// @LINE:64
def getFollowees(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getFollowees(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "getFollowees", Seq(classOf[Long]), "GET", """""", _prefix + """users/getFollowees/$id<[^/]+>""")
)
                      

// @LINE:54
def userLogin(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).userLogin(), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "userLogin", Seq(), "POST", """""", _prefix + """users/login""")
)
                      

// @LINE:53
def userRegister(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).userRegister(), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "userRegister", Seq(), "POST", """""", _prefix + """users/register""")
)
                      

// @LINE:62
def userUnfollow(followerId:Long, followeeId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).userUnfollow(followerId, followeeId), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "userUnfollow", Seq(classOf[Long], classOf[Long]), "GET", """""", _prefix + """users/unfollow/followerId/$followerId<[^/]+>/followeeId/$followeeId<[^/]+>""")
)
                      

// @LINE:50
def getAllUsers(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getAllUsers(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "getAllUsers", Seq(classOf[String]), "GET", """""", _prefix + """users/getAllUsers/json""")
)
                      

// @LINE:66
def sendFriendRequest(senderId:Long, receiverId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).sendFriendRequest(senderId, receiverId), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "sendFriendRequest", Seq(classOf[Long], classOf[Long]), "GET", """""", _prefix + """users/sendFriendRequest/sender/$senderId<[^/]+>/receiver/$receiverId<[^/]+>""")
)
                      

// @LINE:49
def deleteUser(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).deleteUser(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "deleteUser", Seq(classOf[Long]), "DELETE", """ Users""", _prefix + """users/delete/$id<[^/]+>""")
)
                      

// @LINE:67
def getFriendRequests(userId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getFriendRequests(userId), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "getFriendRequests", Seq(classOf[Long]), "GET", """""", _prefix + """users/getFriendRequests/userId/$userId<[^/]+>""")
)
                      

// @LINE:56
def userSearch(display_name:String, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).userSearch(display_name, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "userSearch", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """users/search/$display_name<[^/]+>/json""")
)
                      

// @LINE:61
def userFollow(followerId:Long, followeeId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).userFollow(followerId, followeeId), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "userFollow", Seq(classOf[Long], classOf[Long]), "GET", """""", _prefix + """users/follow/followerId/$followerId<[^/]+>/followeeId/$followeeId<[^/]+>""")
)
                      

// @LINE:51
def deleteUserByUserNameandPassword(userName:String, password:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).deleteUserByUserNameandPassword(userName, password), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "deleteUserByUserNameandPassword", Seq(classOf[String], classOf[String]), "DELETE", """""", _prefix + """users/delete/userName/$userName<[^/]+>/password/$password<[^/]+>""")
)
                      

// @LINE:69
def rejectFriendRequest(userId:Long, senderId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).rejectFriendRequest(userId, senderId), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "rejectFriendRequest", Seq(classOf[Long], classOf[Long]), "GET", """""", _prefix + """users/rejectFriendRequest/userId/$userId<[^/]+>/sender/$senderId<[^/]+>""")
)
                      

// @LINE:71
def deleteFriend(userId:Long, friendId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).deleteFriend(userId, friendId), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "deleteFriend", Seq(classOf[Long], classOf[Long]), "GET", """""", _prefix + """users/deleteFriend/userId/$userId<[^/]+>/friendId/$friendId<[^/]+>""")
)
                      

// @LINE:59
def getProfile(id:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getProfile(id, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "getProfile", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """users/getprofile/$id<[^/]+>/json""")
)
                      

// @LINE:58
def setProfile(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).setProfile(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "setProfile", Seq(classOf[Long]), "PUT", """""", _prefix + """users/setprofile/$id<[^/]+>""")
)
                      

}
                          

// @LINE:101
// @LINE:100
// @LINE:99
// @LINE:98
class ReverseSuggestionsController {


// @LINE:100
def voteToSuggestion(suggestionId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.SuggestionsController]).voteToSuggestion(suggestionId), HandlerDef(this.getClass.getClassLoader, "", "controllers.SuggestionsController", "voteToSuggestion", Seq(classOf[Long]), "GET", """""", _prefix + """suggestion/voteToSuggestion/$suggestionId<[^/]+>""")
)
                      

// @LINE:99
def addTag(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.SuggestionsController]).addTag(), HandlerDef(this.getClass.getClassLoader, "", "controllers.SuggestionsController", "addTag", Seq(), "POST", """""", _prefix + """suggestion/addTag""")
)
                      

// @LINE:101
def getSuggestionForWorkflow(workflowId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.SuggestionsController]).getSuggestionForWorkflow(workflowId), HandlerDef(this.getClass.getClassLoader, "", "controllers.SuggestionsController", "getSuggestionForWorkflow", Seq(classOf[Long]), "GET", """""", _prefix + """suggestion/getSuggestionForWorkflow/$workflowId<[^/]+>""")
)
                      

// @LINE:98
def publishSuggestion(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.SuggestionsController]).publishSuggestion(), HandlerDef(this.getClass.getClassLoader, "", "controllers.SuggestionsController", "publishSuggestion", Seq(), "POST", """Suggestion""", _prefix + """suggestion/publishSuggestion""")
)
                      

}
                          

// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
class ReverseParameterController {


// @LINE:40
def getAllParameters(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).getAllParameters(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "getAllParameters", Seq(classOf[String]), "GET", """ Parameter""", _prefix + """parameter/getAllParameters/json""")
)
                      

// @LINE:42
def getParameterById(id:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).getParameterById(id, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "getParameterById", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """parameter/getParameter/id/$id<[^/]+>/json""")
)
                      

// @LINE:44
def updateParameterById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).updateParameterById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "updateParameterById", Seq(classOf[Long]), "PUT", """""", _prefix + """parameter/updateParameter/id/$id<[^/]+>""")
)
                      

// @LINE:41
def getParameterByName(id:Long, name:String, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).getParameterByName(id, name, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "getParameterByName", Seq(classOf[Long], classOf[String], classOf[String]), "GET", """""", _prefix + """parameter/getParameter/service/$id<[^/]+>/name/$name<[^/]+>/json""")
)
                      

// @LINE:45
def updateParameterByName(oldName:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).updateParameterByName(oldName), HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "updateParameterByName", Seq(classOf[String]), "PUT", """""", _prefix + """parameter/updateParameter/name/$oldName<[^/]+>""")
)
                      

// @LINE:46
def deleteParameterByName(id:Long, name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).deleteParameterByName(id, name), HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "deleteParameterByName", Seq(classOf[Long], classOf[String]), "DELETE", """""", _prefix + """parameter/deleteParameter/service/$id<[^/]+>/name/$name<[^/]+>""")
)
                      

// @LINE:43
def addParameter(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).addParameter(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "addParameter", Seq(), "POST", """""", _prefix + """parameter/addParameter""")
)
                      

}
                          

// @LINE:113
// @LINE:112
// @LINE:111
// @LINE:110
class ReverseGroupUsersController {


// @LINE:113
def getGroupMember(groupId:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.GroupUsersController]).getGroupMember(groupId, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.GroupUsersController", "getGroupMember", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """group/getGroupMember/$groupId<[^/]+>/json""")
)
                      

// @LINE:112
def getGroupList(userID:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.GroupUsersController]).getGroupList(userID, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.GroupUsersController", "getGroupList", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """group/getGroupList/$userID<[^/]+>/json""")
)
                      

// @LINE:110
def createGroup(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.GroupUsersController]).createGroup(), HandlerDef(this.getClass.getClassLoader, "", "controllers.GroupUsersController", "createGroup", Seq(), "POST", """Group""", _prefix + """group/createGroup""")
)
                      

// @LINE:111
def addMembersToGroup(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.GroupUsersController]).addMembersToGroup(), HandlerDef(this.getClass.getClassLoader, "", "controllers.GroupUsersController", "addMembersToGroup", Seq(), "POST", """""", _prefix + """group/addMembersToGroup""")
)
                      

}
                          

// @LINE:129
// @LINE:128
// @LINE:127
// @LINE:126
// @LINE:125
class ReverseCommentController {


// @LINE:128
def thumbUp(commentId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.CommentController]).thumbUp(commentId), HandlerDef(this.getClass.getClassLoader, "", "controllers.CommentController", "thumbUp", Seq(classOf[Long]), "GET", """""", _prefix + """Comment/thumbUp/$commentId<[^/]+>""")
)
                      

// @LINE:129
def thumbDown(commentId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.CommentController]).thumbDown(commentId), HandlerDef(this.getClass.getClassLoader, "", "controllers.CommentController", "thumbDown", Seq(classOf[Long]), "GET", """""", _prefix + """Comment/thumbDown/$commentId<[^/]+>""")
)
                      

// @LINE:125
def addReply(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.CommentController]).addReply(), HandlerDef(this.getClass.getClassLoader, "", "controllers.CommentController", "addReply", Seq(), "POST", """Comment""", _prefix + """Comment/addReply""")
)
                      

// @LINE:126
def getReply(commentId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.CommentController]).getReply(commentId), HandlerDef(this.getClass.getClassLoader, "", "controllers.CommentController", "getReply", Seq(classOf[Long]), "GET", """""", _prefix + """Comment/getReply/$commentId<[^/]+>""")
)
                      

}
                          

// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
class ReverseDatasetController {


// @LINE:33
def getDataset(id:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).getDataset(id, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "getDataset", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """dataset/getDataset/id/$id<[^/]+>/json""")
)
                      

// @LINE:32
def getAllDatasets(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).getAllDatasets(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "getAllDatasets", Seq(classOf[String]), "GET", """ Dataset""", _prefix + """dataset/getAllDatasets/json""")
)
                      

// @LINE:37
def queryDatasets(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).queryDatasets(), HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "queryDatasets", Seq(), "POST", """""", _prefix + """dataset/queryDataset""")
)
                      

// @LINE:36
def deleteDataset(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).deleteDataset(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "deleteDataset", Seq(classOf[Long]), "DELETE", """""", _prefix + """dataset/deleteDataset/id/$id<[^/]+>""")
)
                      

// @LINE:34
def addDataset(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).addDataset(), HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "addDataset", Seq(), "POST", """""", _prefix + """dataset/addDataset""")
)
                      

// @LINE:35
def updateDatasetById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).updateDatasetById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "updateDatasetById", Seq(classOf[Long]), "PUT", """""", _prefix + """dataset/updateDataset/id/$id<[^/]+>""")
)
                      

}
                          

// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
class ReverseClimateServiceController {


// @LINE:13
def getAllClimateServicesOrderByCreateTime(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllClimateServicesOrderByCreateTime(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getAllClimateServicesOrderByCreateTime", Seq(classOf[String]), "GET", """""", _prefix + """climateService/getAllMostRecentClimateServicesByCreateTime/json""")
)
                      

// @LINE:21
def deleteClimateServiceById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).deleteClimateServiceById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "deleteClimateServiceById", Seq(classOf[Long]), "DELETE", """""", _prefix + """climateService/deleteClimateService/id/$id<[^/]+>""")
)
                      

// @LINE:15
def getAllClimateServicesOrderByCount(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllClimateServicesOrderByCount(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getAllClimateServicesOrderByCount", Seq(classOf[String]), "GET", """""", _prefix + """climateService/getAllMostUsedClimateServices/json""")
)
                      

// @LINE:18
def addServiceEntry(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).addServiceEntry(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "addServiceEntry", Seq(), "POST", """""", _prefix + """climateService/addServiceEntry""")
)
                      

// @LINE:16
def addClimateService(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).addClimateService(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "addClimateService", Seq(), "POST", """""", _prefix + """climateService/addClimateService""")
)
                      

// @LINE:12
def getAllClimateServices(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllClimateServices(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getAllClimateServices", Seq(classOf[String]), "GET", """""", _prefix + """climateService/getAllClimateServices/json""")
)
                      

// @LINE:10
def getClimateService(name:String, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getClimateService(name, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getClimateService", Seq(classOf[String], classOf[String]), "GET", """ Climate Service""", _prefix + """climateService/getClimateService/$name<[^/]+>/json""")
)
                      

// @LINE:19
def updateClimateServiceById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).updateClimateServiceById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "updateClimateServiceById", Seq(classOf[Long]), "PUT", """""", _prefix + """climateService/updateClimateService/id/$id<[^/]+>""")
)
                      

// @LINE:11
def getClimateServiceById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getClimateServiceById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getClimateServiceById", Seq(classOf[Long]), "GET", """""", _prefix + """climateService/getClimateService/id/$id<[^/]+>""")
)
                      

// @LINE:14
def getAllClimateServicesOrderByLatestAccessTime(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllClimateServicesOrderByLatestAccessTime(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getAllClimateServicesOrderByLatestAccessTime", Seq(classOf[String]), "GET", """""", _prefix + """climateService/getAllMostRecentClimateServicesByLatestAccessTime/json""")
)
                      

// @LINE:17
def getAllServiceEntries(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllServiceEntries(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getAllServiceEntries", Seq(classOf[String]), "GET", """""", _prefix + """climateService/getAllServiceEntries/json""")
)
                      

// @LINE:20
def updateClimateServiceByName(oldName:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).updateClimateServiceByName(oldName), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "updateClimateServiceByName", Seq(classOf[String]), "PUT", """""", _prefix + """climateService/updateClimateService/name/$oldName<[^/]+>""")
)
                      

// @LINE:22
def deleteClimateServiceByName(name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).deleteClimateServiceByName(name), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "deleteClimateServiceByName", Seq(classOf[String]), "DELETE", """""", _prefix + """climateService/deleteClimateService/name/$name<[^/]+>""")
)
                      

}
                          
}
        
    