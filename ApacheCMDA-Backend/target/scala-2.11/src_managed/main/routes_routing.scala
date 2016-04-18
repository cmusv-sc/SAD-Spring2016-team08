// @SOURCE:/home/my/ApacheCMDA-Backend/conf/routes
// @HASH:979faf9401eebdb5ca18a6b17a9434b220ba43a9
// @DATE:Mon Apr 18 04:02:35 UTC 2016


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:10
private[this] lazy val controllers_ClimateServiceController_getClimateService0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/getClimateService/"),DynamicPart("name", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_ClimateServiceController_getClimateService0_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getClimateService(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getClimateService", Seq(classOf[String], classOf[String]),"GET", """ Climate Service""", Routes.prefix + """climateService/getClimateService/$name<[^/]+>/json"""))
        

// @LINE:11
private[this] lazy val controllers_ClimateServiceController_getClimateServiceById1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/getClimateService/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ClimateServiceController_getClimateServiceById1_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getClimateServiceById(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getClimateServiceById", Seq(classOf[Long]),"GET", """""", Routes.prefix + """climateService/getClimateService/id/$id<[^/]+>"""))
        

// @LINE:12
private[this] lazy val controllers_ClimateServiceController_getAllClimateServices2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/getAllClimateServices/json"))))
private[this] lazy val controllers_ClimateServiceController_getAllClimateServices2_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllClimateServices(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getAllClimateServices", Seq(classOf[String]),"GET", """""", Routes.prefix + """climateService/getAllClimateServices/json"""))
        

// @LINE:13
private[this] lazy val controllers_ClimateServiceController_getAllClimateServicesOrderByCreateTime3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/getAllMostRecentClimateServicesByCreateTime/json"))))
private[this] lazy val controllers_ClimateServiceController_getAllClimateServicesOrderByCreateTime3_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllClimateServicesOrderByCreateTime(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getAllClimateServicesOrderByCreateTime", Seq(classOf[String]),"GET", """""", Routes.prefix + """climateService/getAllMostRecentClimateServicesByCreateTime/json"""))
        

// @LINE:14
private[this] lazy val controllers_ClimateServiceController_getAllClimateServicesOrderByLatestAccessTime4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/getAllMostRecentClimateServicesByLatestAccessTime/json"))))
private[this] lazy val controllers_ClimateServiceController_getAllClimateServicesOrderByLatestAccessTime4_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllClimateServicesOrderByLatestAccessTime(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getAllClimateServicesOrderByLatestAccessTime", Seq(classOf[String]),"GET", """""", Routes.prefix + """climateService/getAllMostRecentClimateServicesByLatestAccessTime/json"""))
        

// @LINE:15
private[this] lazy val controllers_ClimateServiceController_getAllClimateServicesOrderByCount5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/getAllMostUsedClimateServices/json"))))
private[this] lazy val controllers_ClimateServiceController_getAllClimateServicesOrderByCount5_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllClimateServicesOrderByCount(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getAllClimateServicesOrderByCount", Seq(classOf[String]),"GET", """""", Routes.prefix + """climateService/getAllMostUsedClimateServices/json"""))
        

// @LINE:16
private[this] lazy val controllers_ClimateServiceController_addClimateService6_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/addClimateService"))))
private[this] lazy val controllers_ClimateServiceController_addClimateService6_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).addClimateService,
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "addClimateService", Nil,"POST", """""", Routes.prefix + """climateService/addClimateService"""))
        

// @LINE:17
private[this] lazy val controllers_ClimateServiceController_getAllServiceEntries7_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/getAllServiceEntries/json"))))
private[this] lazy val controllers_ClimateServiceController_getAllServiceEntries7_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllServiceEntries(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getAllServiceEntries", Seq(classOf[String]),"GET", """""", Routes.prefix + """climateService/getAllServiceEntries/json"""))
        

// @LINE:18
private[this] lazy val controllers_ClimateServiceController_addServiceEntry8_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/addServiceEntry"))))
private[this] lazy val controllers_ClimateServiceController_addServiceEntry8_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).addServiceEntry,
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "addServiceEntry", Nil,"POST", """""", Routes.prefix + """climateService/addServiceEntry"""))
        

// @LINE:19
private[this] lazy val controllers_ClimateServiceController_updateClimateServiceById9_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/updateClimateService/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ClimateServiceController_updateClimateServiceById9_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).updateClimateServiceById(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "updateClimateServiceById", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """climateService/updateClimateService/id/$id<[^/]+>"""))
        

// @LINE:20
private[this] lazy val controllers_ClimateServiceController_updateClimateServiceByName10_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/updateClimateService/name/"),DynamicPart("oldName", """[^/]+""",true))))
private[this] lazy val controllers_ClimateServiceController_updateClimateServiceByName10_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).updateClimateServiceByName(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "updateClimateServiceByName", Seq(classOf[String]),"PUT", """""", Routes.prefix + """climateService/updateClimateService/name/$oldName<[^/]+>"""))
        

// @LINE:21
private[this] lazy val controllers_ClimateServiceController_deleteClimateServiceById11_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/deleteClimateService/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ClimateServiceController_deleteClimateServiceById11_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).deleteClimateServiceById(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "deleteClimateServiceById", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """climateService/deleteClimateService/id/$id<[^/]+>"""))
        

// @LINE:22
private[this] lazy val controllers_ClimateServiceController_deleteClimateServiceByName12_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climateService/deleteClimateService/name/"),DynamicPart("name", """[^/]+""",true))))
private[this] lazy val controllers_ClimateServiceController_deleteClimateServiceByName12_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).deleteClimateServiceByName(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "deleteClimateServiceByName", Seq(classOf[String]),"DELETE", """""", Routes.prefix + """climateService/deleteClimateService/name/$name<[^/]+>"""))
        

// @LINE:25
private[this] lazy val controllers_InstrumentController_getAllInstruments13_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("instrument/getAllInstruments/json"))))
private[this] lazy val controllers_InstrumentController_getAllInstruments13_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).getAllInstruments(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.InstrumentController", "getAllInstruments", Seq(classOf[String]),"GET", """ Instrument""", Routes.prefix + """instrument/getAllInstruments/json"""))
        

// @LINE:26
private[this] lazy val controllers_InstrumentController_getInstrument14_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("instrument/getInstrument/id/"),DynamicPart("id", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_InstrumentController_getInstrument14_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).getInstrument(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.InstrumentController", "getInstrument", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """instrument/getInstrument/id/$id<[^/]+>/json"""))
        

// @LINE:27
private[this] lazy val controllers_InstrumentController_addInstrument15_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("instrument/addInstrument"))))
private[this] lazy val controllers_InstrumentController_addInstrument15_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).addInstrument,
HandlerDef(this.getClass.getClassLoader, "", "controllers.InstrumentController", "addInstrument", Nil,"POST", """""", Routes.prefix + """instrument/addInstrument"""))
        

// @LINE:28
private[this] lazy val controllers_InstrumentController_updateInstrumentById16_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("instrument/updateInstrument/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_InstrumentController_updateInstrumentById16_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).updateInstrumentById(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.InstrumentController", "updateInstrumentById", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """instrument/updateInstrument/id/$id<[^/]+>"""))
        

// @LINE:29
private[this] lazy val controllers_InstrumentController_deleteInstrument17_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("instrument/deleteInstrument/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_InstrumentController_deleteInstrument17_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).deleteInstrument(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.InstrumentController", "deleteInstrument", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """instrument/deleteInstrument/id/$id<[^/]+>"""))
        

// @LINE:32
private[this] lazy val controllers_DatasetController_getAllDatasets18_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("dataset/getAllDatasets/json"))))
private[this] lazy val controllers_DatasetController_getAllDatasets18_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).getAllDatasets(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "getAllDatasets", Seq(classOf[String]),"GET", """ Dataset""", Routes.prefix + """dataset/getAllDatasets/json"""))
        

// @LINE:33
private[this] lazy val controllers_DatasetController_getDataset19_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("dataset/getDataset/id/"),DynamicPart("id", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_DatasetController_getDataset19_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).getDataset(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "getDataset", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """dataset/getDataset/id/$id<[^/]+>/json"""))
        

// @LINE:34
private[this] lazy val controllers_DatasetController_addDataset20_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("dataset/addDataset"))))
private[this] lazy val controllers_DatasetController_addDataset20_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).addDataset,
HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "addDataset", Nil,"POST", """""", Routes.prefix + """dataset/addDataset"""))
        

// @LINE:35
private[this] lazy val controllers_DatasetController_updateDatasetById21_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("dataset/updateDataset/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_DatasetController_updateDatasetById21_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).updateDatasetById(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "updateDatasetById", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """dataset/updateDataset/id/$id<[^/]+>"""))
        

// @LINE:36
private[this] lazy val controllers_DatasetController_deleteDataset22_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("dataset/deleteDataset/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_DatasetController_deleteDataset22_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).deleteDataset(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "deleteDataset", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """dataset/deleteDataset/id/$id<[^/]+>"""))
        

// @LINE:37
private[this] lazy val controllers_DatasetController_queryDatasets23_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("dataset/queryDataset"))))
private[this] lazy val controllers_DatasetController_queryDatasets23_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).queryDatasets,
HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "queryDatasets", Nil,"POST", """""", Routes.prefix + """dataset/queryDataset"""))
        

// @LINE:40
private[this] lazy val controllers_ParameterController_getAllParameters24_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("parameter/getAllParameters/json"))))
private[this] lazy val controllers_ParameterController_getAllParameters24_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).getAllParameters(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "getAllParameters", Seq(classOf[String]),"GET", """ Parameter""", Routes.prefix + """parameter/getAllParameters/json"""))
        

// @LINE:41
private[this] lazy val controllers_ParameterController_getParameterByName25_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("parameter/getParameter/service/"),DynamicPart("id", """[^/]+""",true),StaticPart("/name/"),DynamicPart("name", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_ParameterController_getParameterByName25_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).getParameterByName(fakeValue[Long], fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "getParameterByName", Seq(classOf[Long], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """parameter/getParameter/service/$id<[^/]+>/name/$name<[^/]+>/json"""))
        

// @LINE:42
private[this] lazy val controllers_ParameterController_getParameterById26_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("parameter/getParameter/id/"),DynamicPart("id", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_ParameterController_getParameterById26_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).getParameterById(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "getParameterById", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """parameter/getParameter/id/$id<[^/]+>/json"""))
        

// @LINE:43
private[this] lazy val controllers_ParameterController_addParameter27_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("parameter/addParameter"))))
private[this] lazy val controllers_ParameterController_addParameter27_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).addParameter,
HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "addParameter", Nil,"POST", """""", Routes.prefix + """parameter/addParameter"""))
        

// @LINE:44
private[this] lazy val controllers_ParameterController_updateParameterById28_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("parameter/updateParameter/id/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_ParameterController_updateParameterById28_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).updateParameterById(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "updateParameterById", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """parameter/updateParameter/id/$id<[^/]+>"""))
        

// @LINE:45
private[this] lazy val controllers_ParameterController_updateParameterByName29_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("parameter/updateParameter/name/"),DynamicPart("oldName", """[^/]+""",true))))
private[this] lazy val controllers_ParameterController_updateParameterByName29_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).updateParameterByName(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "updateParameterByName", Seq(classOf[String]),"PUT", """""", Routes.prefix + """parameter/updateParameter/name/$oldName<[^/]+>"""))
        

// @LINE:46
private[this] lazy val controllers_ParameterController_deleteParameterByName30_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("parameter/deleteParameter/service/"),DynamicPart("id", """[^/]+""",true),StaticPart("/name/"),DynamicPart("name", """[^/]+""",true))))
private[this] lazy val controllers_ParameterController_deleteParameterByName30_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).deleteParameterByName(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "deleteParameterByName", Seq(classOf[Long], classOf[String]),"DELETE", """""", Routes.prefix + """parameter/deleteParameter/service/$id<[^/]+>/name/$name<[^/]+>"""))
        

// @LINE:49
private[this] lazy val controllers_UserController_deleteUser31_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/delete/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_UserController_deleteUser31_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).deleteUser(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "deleteUser", Seq(classOf[Long]),"DELETE", """ Users""", Routes.prefix + """users/delete/$id<[^/]+>"""))
        

// @LINE:50
private[this] lazy val controllers_UserController_getAllUsers32_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/getAllUsers/json"))))
private[this] lazy val controllers_UserController_getAllUsers32_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getAllUsers(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "getAllUsers", Seq(classOf[String]),"GET", """""", Routes.prefix + """users/getAllUsers/json"""))
        

// @LINE:51
private[this] lazy val controllers_UserController_deleteUserByUserNameandPassword33_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/delete/userName/"),DynamicPart("userName", """[^/]+""",true),StaticPart("/password/"),DynamicPart("password", """[^/]+""",true))))
private[this] lazy val controllers_UserController_deleteUserByUserNameandPassword33_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).deleteUserByUserNameandPassword(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "deleteUserByUserNameandPassword", Seq(classOf[String], classOf[String]),"DELETE", """""", Routes.prefix + """users/delete/userName/$userName<[^/]+>/password/$password<[^/]+>"""))
        

// @LINE:53
private[this] lazy val controllers_UserController_userRegister34_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/register"))))
private[this] lazy val controllers_UserController_userRegister34_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).userRegister,
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "userRegister", Nil,"POST", """""", Routes.prefix + """users/register"""))
        

// @LINE:54
private[this] lazy val controllers_UserController_userLogin35_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/login"))))
private[this] lazy val controllers_UserController_userLogin35_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).userLogin,
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "userLogin", Nil,"POST", """""", Routes.prefix + """users/login"""))
        

// @LINE:56
private[this] lazy val controllers_UserController_userSearch36_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/search/"),DynamicPart("display_name", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_UserController_userSearch36_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).userSearch(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "userSearch", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """users/search/$display_name<[^/]+>/json"""))
        

// @LINE:58
private[this] lazy val controllers_UserController_setProfile37_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/setprofile/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_UserController_setProfile37_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).setProfile(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "setProfile", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """users/setprofile/$id<[^/]+>"""))
        

// @LINE:59
private[this] lazy val controllers_UserController_getProfile38_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/getprofile/"),DynamicPart("id", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_UserController_getProfile38_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getProfile(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "getProfile", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """users/getprofile/$id<[^/]+>/json"""))
        

// @LINE:61
private[this] lazy val controllers_UserController_userFollow39_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/follow/followerId/"),DynamicPart("followerId", """[^/]+""",true),StaticPart("/followeeId/"),DynamicPart("followeeId", """[^/]+""",true))))
private[this] lazy val controllers_UserController_userFollow39_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).userFollow(fakeValue[Long], fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "userFollow", Seq(classOf[Long], classOf[Long]),"GET", """""", Routes.prefix + """users/follow/followerId/$followerId<[^/]+>/followeeId/$followeeId<[^/]+>"""))
        

// @LINE:62
private[this] lazy val controllers_UserController_userUnfollow40_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/unfollow/followerId/"),DynamicPart("followerId", """[^/]+""",true),StaticPart("/followeeId/"),DynamicPart("followeeId", """[^/]+""",true))))
private[this] lazy val controllers_UserController_userUnfollow40_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).userUnfollow(fakeValue[Long], fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "userUnfollow", Seq(classOf[Long], classOf[Long]),"GET", """""", Routes.prefix + """users/unfollow/followerId/$followerId<[^/]+>/followeeId/$followeeId<[^/]+>"""))
        

// @LINE:63
private[this] lazy val controllers_UserController_getFollowers41_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/getFollowers/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_UserController_getFollowers41_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getFollowers(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "getFollowers", Seq(classOf[Long]),"GET", """""", Routes.prefix + """users/getFollowers/$id<[^/]+>"""))
        

// @LINE:64
private[this] lazy val controllers_UserController_getFollowees42_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/getFollowees/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_UserController_getFollowees42_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getFollowees(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "getFollowees", Seq(classOf[Long]),"GET", """""", Routes.prefix + """users/getFollowees/$id<[^/]+>"""))
        

// @LINE:66
private[this] lazy val controllers_UserController_sendFriendRequest43_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/sendFriendRequest/sender/"),DynamicPart("senderId", """[^/]+""",true),StaticPart("/receiver/"),DynamicPart("receiverId", """[^/]+""",true))))
private[this] lazy val controllers_UserController_sendFriendRequest43_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).sendFriendRequest(fakeValue[Long], fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "sendFriendRequest", Seq(classOf[Long], classOf[Long]),"GET", """""", Routes.prefix + """users/sendFriendRequest/sender/$senderId<[^/]+>/receiver/$receiverId<[^/]+>"""))
        

// @LINE:67
private[this] lazy val controllers_UserController_getFriendRequests44_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/getFriendRequests/userId/"),DynamicPart("userId", """[^/]+""",true))))
private[this] lazy val controllers_UserController_getFriendRequests44_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getFriendRequests(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "getFriendRequests", Seq(classOf[Long]),"GET", """""", Routes.prefix + """users/getFriendRequests/userId/$userId<[^/]+>"""))
        

// @LINE:68
private[this] lazy val controllers_UserController_acceptFriendRequest45_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/acceptFriendRequest/userId/"),DynamicPart("userId", """[^/]+""",true),StaticPart("/sender/"),DynamicPart("senderId", """[^/]+""",true))))
private[this] lazy val controllers_UserController_acceptFriendRequest45_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).acceptFriendRequest(fakeValue[Long], fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "acceptFriendRequest", Seq(classOf[Long], classOf[Long]),"GET", """""", Routes.prefix + """users/acceptFriendRequest/userId/$userId<[^/]+>/sender/$senderId<[^/]+>"""))
        

// @LINE:69
private[this] lazy val controllers_UserController_rejectFriendRequest46_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/rejectFriendRequest/userId/"),DynamicPart("userId", """[^/]+""",true),StaticPart("/sender/"),DynamicPart("senderId", """[^/]+""",true))))
private[this] lazy val controllers_UserController_rejectFriendRequest46_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).rejectFriendRequest(fakeValue[Long], fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "rejectFriendRequest", Seq(classOf[Long], classOf[Long]),"GET", """""", Routes.prefix + """users/rejectFriendRequest/userId/$userId<[^/]+>/sender/$senderId<[^/]+>"""))
        

// @LINE:70
private[this] lazy val controllers_UserController_getFriends47_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/getFriends/userId/"),DynamicPart("userId", """[^/]+""",true))))
private[this] lazy val controllers_UserController_getFriends47_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getFriends(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "getFriends", Seq(classOf[Long]),"GET", """""", Routes.prefix + """users/getFriends/userId/$userId<[^/]+>"""))
        

// @LINE:71
private[this] lazy val controllers_UserController_deleteFriend48_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/deleteFriend/userId/"),DynamicPart("userId", """[^/]+""",true),StaticPart("/friendId/"),DynamicPart("friendId", """[^/]+""",true))))
private[this] lazy val controllers_UserController_deleteFriend48_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).deleteFriend(fakeValue[Long], fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "deleteFriend", Seq(classOf[Long], classOf[Long]),"GET", """""", Routes.prefix + """users/deleteFriend/userId/$userId<[^/]+>/friendId/$friendId<[^/]+>"""))
        

// @LINE:75
private[this] lazy val controllers_WorkflowController_post49_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/post"))))
private[this] lazy val controllers_WorkflowController_post49_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).post,
HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "post", Nil,"POST", """ Workflow""", Routes.prefix + """workflow/post"""))
        

// @LINE:76
private[this] lazy val controllers_WorkflowController_updateWorkflow50_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/updateWorkflow"))))
private[this] lazy val controllers_WorkflowController_updateWorkflow50_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).updateWorkflow,
HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "updateWorkflow", Nil,"POST", """""", Routes.prefix + """workflow/updateWorkflow"""))
        

// @LINE:77
private[this] lazy val controllers_WorkflowController_deleteWorkflow51_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/deleteWorkflow"))))
private[this] lazy val controllers_WorkflowController_deleteWorkflow51_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).deleteWorkflow,
HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "deleteWorkflow", Nil,"POST", """""", Routes.prefix + """workflow/deleteWorkflow"""))
        

// @LINE:78
private[this] lazy val controllers_WorkflowController_get52_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/get/workflowID/"),DynamicPart("wfID", """[^/]+""",true),StaticPart("/userID/"),DynamicPart("userID", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_WorkflowController_get52_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).get(fakeValue[Long], fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "get", Seq(classOf[Long], classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """workflow/get/workflowID/$wfID<[^/]+>/userID/$userID<[^/]+>/json"""))
        

// @LINE:79
private[this] lazy val controllers_WorkflowController_getTimeLine53_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/getTimeline/"),DynamicPart("id", """[^/]+""",true),StaticPart("/offset/"),DynamicPart("offset", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_WorkflowController_getTimeLine53_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getTimeLine(fakeValue[Long], fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "getTimeLine", Seq(classOf[Long], classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """workflow/getTimeline/$id<[^/]+>/offset/$offset<[^/]+>/json"""))
        

// @LINE:80
private[this] lazy val controllers_WorkflowController_getWorkflowList54_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/getWorkflowList/"),DynamicPart("id", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_WorkflowController_getWorkflowList54_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getWorkflowList(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "getWorkflowList", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """workflow/getWorkflowList/$id<[^/]+>/json"""))
        

// @LINE:81
private[this] lazy val controllers_WorkflowController_uploadImage55_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/uploadImage/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_WorkflowController_uploadImage55_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).uploadImage(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "uploadImage", Seq(classOf[Long]),"POST", """""", Routes.prefix + """workflow/uploadImage/$id<[^/]+>"""))
        

// @LINE:82
private[this] lazy val controllers_WorkflowController_getPublicWorkflow56_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/getPublicWorkflow/json"))))
private[this] lazy val controllers_WorkflowController_getPublicWorkflow56_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getPublicWorkflow(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "getPublicWorkflow", Seq(classOf[String]),"GET", """""", Routes.prefix + """workflow/getPublicWorkflow/json"""))
        

// @LINE:84
private[this] lazy val controllers_WorkflowController_getTags57_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/getTags/workflowId/"),DynamicPart("wfId", """[^/]+""",true))))
private[this] lazy val controllers_WorkflowController_getTags57_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getTags(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "getTags", Seq(classOf[Long]),"GET", """""", Routes.prefix + """workflow/getTags/workflowId/$wfId<[^/]+>"""))
        

// @LINE:85
private[this] lazy val controllers_WorkflowController_setTag58_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/setTag"))))
private[this] lazy val controllers_WorkflowController_setTag58_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).setTag,
HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "setTag", Nil,"POST", """""", Routes.prefix + """workflow/setTag"""))
        

// @LINE:86
private[this] lazy val controllers_WorkflowController_deleteTag59_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/deleteTag/workflowId/"),DynamicPart("wfId", """[^/]+""",true),StaticPart("/tag/"),DynamicPart("tag", """[^/]+""",true))))
private[this] lazy val controllers_WorkflowController_deleteTag59_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).deleteTag(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "deleteTag", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """workflow/deleteTag/workflowId/$wfId<[^/]+>/tag/$tag<[^/]+>"""))
        

// @LINE:87
private[this] lazy val controllers_WorkflowController_getByTag60_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/getByTag/tag/"),DynamicPart("tag", """[^/]+""",true))))
private[this] lazy val controllers_WorkflowController_getByTag60_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getByTag(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "getByTag", Seq(classOf[String]),"GET", """""", Routes.prefix + """workflow/getByTag/tag/$tag<[^/]+>"""))
        

// @LINE:88
private[this] lazy val controllers_WorkflowController_getByTitle61_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/getByTitle/title/"),DynamicPart("title", """[^/]+""",true))))
private[this] lazy val controllers_WorkflowController_getByTitle61_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getByTitle(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "getByTitle", Seq(classOf[String]),"GET", """""", Routes.prefix + """workflow/getByTitle/title/$title<[^/]+>"""))
        

// @LINE:89
private[this] lazy val controllers_WorkflowController_getTop3WorkFlow62_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/getTop3WorkFlow"))))
private[this] lazy val controllers_WorkflowController_getTop3WorkFlow62_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getTop3WorkFlow(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "getTop3WorkFlow", Nil,"GET", """""", Routes.prefix + """workflow/getTop3WorkFlow"""))
        

// @LINE:92
private[this] lazy val controllers_MailController_sendMail63_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mail/sendMail"))))
private[this] lazy val controllers_MailController_sendMail63_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.MailController]).sendMail,
HandlerDef(this.getClass.getClassLoader, "", "controllers.MailController", "sendMail", Nil,"POST", """ Mail""", Routes.prefix + """mail/sendMail"""))
        

// @LINE:93
private[this] lazy val controllers_MailController_readMail64_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mail/getMailDetail/mailId/"),DynamicPart("mailId", """[^/]+""",true))))
private[this] lazy val controllers_MailController_readMail64_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.MailController]).readMail(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.MailController", "readMail", Seq(classOf[Long]),"GET", """""", Routes.prefix + """mail/getMailDetail/mailId/$mailId<[^/]+>"""))
        

// @LINE:94
private[this] lazy val controllers_MailController_getInbox65_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mail/getInbox/"),DynamicPart("id", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_MailController_getInbox65_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.MailController]).getInbox(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.MailController", "getInbox", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """mail/getInbox/$id<[^/]+>/json"""))
        

// @LINE:95
private[this] lazy val controllers_MailController_getOutbox66_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mail/getOutbox/"),DynamicPart("id", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_MailController_getOutbox66_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.MailController]).getOutbox(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.MailController", "getOutbox", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """mail/getOutbox/$id<[^/]+>/json"""))
        

// @LINE:98
private[this] lazy val controllers_SuggestionsController_publishSuggestion67_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("suggestion/publishSuggestion"))))
private[this] lazy val controllers_SuggestionsController_publishSuggestion67_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.SuggestionsController]).publishSuggestion,
HandlerDef(this.getClass.getClassLoader, "", "controllers.SuggestionsController", "publishSuggestion", Nil,"POST", """Suggestion""", Routes.prefix + """suggestion/publishSuggestion"""))
        

// @LINE:99
private[this] lazy val controllers_SuggestionsController_addTag68_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("suggestion/addTag"))))
private[this] lazy val controllers_SuggestionsController_addTag68_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.SuggestionsController]).addTag,
HandlerDef(this.getClass.getClassLoader, "", "controllers.SuggestionsController", "addTag", Nil,"POST", """""", Routes.prefix + """suggestion/addTag"""))
        

// @LINE:100
private[this] lazy val controllers_SuggestionsController_voteToSuggestion69_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("suggestion/voteToSuggestion/"),DynamicPart("suggestionId", """[^/]+""",true))))
private[this] lazy val controllers_SuggestionsController_voteToSuggestion69_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.SuggestionsController]).voteToSuggestion(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.SuggestionsController", "voteToSuggestion", Seq(classOf[Long]),"GET", """""", Routes.prefix + """suggestion/voteToSuggestion/$suggestionId<[^/]+>"""))
        

// @LINE:101
private[this] lazy val controllers_SuggestionsController_getSuggestionForWorkflow70_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("suggestion/getSuggestionForWorkflow/"),DynamicPart("workflowId", """[^/]+""",true))))
private[this] lazy val controllers_SuggestionsController_getSuggestionForWorkflow70_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.SuggestionsController]).getSuggestionForWorkflow(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.SuggestionsController", "getSuggestionForWorkflow", Seq(classOf[Long]),"GET", """""", Routes.prefix + """suggestion/getSuggestionForWorkflow/$workflowId<[^/]+>"""))
        

// @LINE:105
private[this] lazy val controllers_TagController_createTag71_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tag/createTag"))))
private[this] lazy val controllers_TagController_createTag71_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.TagController]).createTag,
HandlerDef(this.getClass.getClassLoader, "", "controllers.TagController", "createTag", Nil,"POST", """ Tag
input:String tag""", Routes.prefix + """tag/createTag"""))
        

// @LINE:106
private[this] lazy val controllers_TagController_deleteTag72_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tag/deleteTag"))))
private[this] lazy val controllers_TagController_deleteTag72_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.TagController]).deleteTag,
HandlerDef(this.getClass.getClassLoader, "", "controllers.TagController", "deleteTag", Nil,"POST", """""", Routes.prefix + """tag/deleteTag"""))
        

// @LINE:110
private[this] lazy val controllers_GroupUsersController_createGroup73_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("group/createGroup"))))
private[this] lazy val controllers_GroupUsersController_createGroup73_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.GroupUsersController]).createGroup,
HandlerDef(this.getClass.getClassLoader, "", "controllers.GroupUsersController", "createGroup", Nil,"POST", """Group""", Routes.prefix + """group/createGroup"""))
        

// @LINE:111
private[this] lazy val controllers_GroupUsersController_addMembersToGroup74_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("group/addMembersToGroup"))))
private[this] lazy val controllers_GroupUsersController_addMembersToGroup74_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.GroupUsersController]).addMembersToGroup,
HandlerDef(this.getClass.getClassLoader, "", "controllers.GroupUsersController", "addMembersToGroup", Nil,"POST", """""", Routes.prefix + """group/addMembersToGroup"""))
        

// @LINE:112
private[this] lazy val controllers_GroupUsersController_getGroupList75_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("group/getGroupList/"),DynamicPart("userID", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_GroupUsersController_getGroupList75_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.GroupUsersController]).getGroupList(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.GroupUsersController", "getGroupList", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """group/getGroupList/$userID<[^/]+>/json"""))
        

// @LINE:113
private[this] lazy val controllers_GroupUsersController_getGroupMember76_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("group/getGroupMember/"),DynamicPart("groupId", """[^/]+""",true),StaticPart("/json"))))
private[this] lazy val controllers_GroupUsersController_getGroupMember76_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.GroupUsersController]).getGroupMember(fakeValue[Long], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.GroupUsersController", "getGroupMember", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """group/getGroupMember/$groupId<[^/]+>/json"""))
        

// @LINE:117
private[this] lazy val controllers_Assets_at77_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at77_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        

// @LINE:122
private[this] lazy val controllers_WorkflowController_addComment78_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/addComment"))))
private[this] lazy val controllers_WorkflowController_addComment78_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).addComment,
HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "addComment", Nil,"POST", """Workflow
GET            /workflow/getTimeline/:id/offset/:offset/json                                              @controllers.UserController.userSearch(id: Long, offset: Long, format: String="json")""", Routes.prefix + """workflow/addComment"""))
        

// @LINE:123
private[this] lazy val controllers_WorkflowController_getComments79_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("workflow/getComments/"),DynamicPart("workflowId", """[^/]+""",true))))
private[this] lazy val controllers_WorkflowController_getComments79_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getComments(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.WorkflowController", "getComments", Seq(classOf[Long]),"GET", """""", Routes.prefix + """workflow/getComments/$workflowId<[^/]+>"""))
        

// @LINE:125
private[this] lazy val controllers_CommentController_addReply80_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Comment/addReply"))))
private[this] lazy val controllers_CommentController_addReply80_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.CommentController]).addReply,
HandlerDef(this.getClass.getClassLoader, "", "controllers.CommentController", "addReply", Nil,"POST", """Comment""", Routes.prefix + """Comment/addReply"""))
        

// @LINE:126
private[this] lazy val controllers_CommentController_getReply81_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Comment/getReply/"),DynamicPart("commentId", """[^/]+""",true))))
private[this] lazy val controllers_CommentController_getReply81_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.CommentController]).getReply(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CommentController", "getReply", Seq(classOf[Long]),"GET", """""", Routes.prefix + """Comment/getReply/$commentId<[^/]+>"""))
        

// @LINE:127
private[this] lazy val controllers_CommentController_getReply82_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Comment/getReply/"),DynamicPart("commentId", """[^/]+""",true))))
private[this] lazy val controllers_CommentController_getReply82_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.CommentController]).getReply(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CommentController", "getReply", Seq(classOf[Long]),"GET", """""", Routes.prefix + """Comment/getReply/$commentId<[^/]+>"""))
        

// @LINE:128
private[this] lazy val controllers_CommentController_thumbUp83_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Comment/thumbUp/"),DynamicPart("commentId", """[^/]+""",true))))
private[this] lazy val controllers_CommentController_thumbUp83_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.CommentController]).thumbUp(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CommentController", "thumbUp", Seq(classOf[Long]),"GET", """""", Routes.prefix + """Comment/thumbUp/$commentId<[^/]+>"""))
        

// @LINE:129
private[this] lazy val controllers_CommentController_thumbDown84_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Comment/thumbDown/"),DynamicPart("commentId", """[^/]+""",true))))
private[this] lazy val controllers_CommentController_thumbDown84_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.CommentController]).thumbDown(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CommentController", "thumbDown", Seq(classOf[Long]),"GET", """""", Routes.prefix + """Comment/thumbDown/$commentId<[^/]+>"""))
        
def documentation = List(("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/getClimateService/$name<[^/]+>/json""","""@controllers.ClimateServiceController@.getClimateService(name:String, format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/getClimateService/id/$id<[^/]+>""","""@controllers.ClimateServiceController@.getClimateServiceById(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/getAllClimateServices/json""","""@controllers.ClimateServiceController@.getAllClimateServices(format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/getAllMostRecentClimateServicesByCreateTime/json""","""@controllers.ClimateServiceController@.getAllClimateServicesOrderByCreateTime(format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/getAllMostRecentClimateServicesByLatestAccessTime/json""","""@controllers.ClimateServiceController@.getAllClimateServicesOrderByLatestAccessTime(format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/getAllMostUsedClimateServices/json""","""@controllers.ClimateServiceController@.getAllClimateServicesOrderByCount(format:String = "json")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/addClimateService""","""@controllers.ClimateServiceController@.addClimateService"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/getAllServiceEntries/json""","""@controllers.ClimateServiceController@.getAllServiceEntries(format:String = "json")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/addServiceEntry""","""@controllers.ClimateServiceController@.addServiceEntry"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/updateClimateService/id/$id<[^/]+>""","""@controllers.ClimateServiceController@.updateClimateServiceById(id:Long)"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/updateClimateService/name/$oldName<[^/]+>""","""@controllers.ClimateServiceController@.updateClimateServiceByName(oldName:String)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/deleteClimateService/id/$id<[^/]+>""","""@controllers.ClimateServiceController@.deleteClimateServiceById(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climateService/deleteClimateService/name/$name<[^/]+>""","""@controllers.ClimateServiceController@.deleteClimateServiceByName(name:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """instrument/getAllInstruments/json""","""@controllers.InstrumentController@.getAllInstruments(format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """instrument/getInstrument/id/$id<[^/]+>/json""","""@controllers.InstrumentController@.getInstrument(id:Long, format:String = "json")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """instrument/addInstrument""","""@controllers.InstrumentController@.addInstrument"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """instrument/updateInstrument/id/$id<[^/]+>""","""@controllers.InstrumentController@.updateInstrumentById(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """instrument/deleteInstrument/id/$id<[^/]+>""","""@controllers.InstrumentController@.deleteInstrument(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dataset/getAllDatasets/json""","""@controllers.DatasetController@.getAllDatasets(format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dataset/getDataset/id/$id<[^/]+>/json""","""@controllers.DatasetController@.getDataset(id:Long, format:String = "json")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dataset/addDataset""","""@controllers.DatasetController@.addDataset"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dataset/updateDataset/id/$id<[^/]+>""","""@controllers.DatasetController@.updateDatasetById(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dataset/deleteDataset/id/$id<[^/]+>""","""@controllers.DatasetController@.deleteDataset(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dataset/queryDataset""","""@controllers.DatasetController@.queryDatasets"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """parameter/getAllParameters/json""","""@controllers.ParameterController@.getAllParameters(format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """parameter/getParameter/service/$id<[^/]+>/name/$name<[^/]+>/json""","""@controllers.ParameterController@.getParameterByName(id:Long, name:String, format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """parameter/getParameter/id/$id<[^/]+>/json""","""@controllers.ParameterController@.getParameterById(id:Long, format:String = "json")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """parameter/addParameter""","""@controllers.ParameterController@.addParameter"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """parameter/updateParameter/id/$id<[^/]+>""","""@controllers.ParameterController@.updateParameterById(id:Long)"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """parameter/updateParameter/name/$oldName<[^/]+>""","""@controllers.ParameterController@.updateParameterByName(oldName:String)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """parameter/deleteParameter/service/$id<[^/]+>/name/$name<[^/]+>""","""@controllers.ParameterController@.deleteParameterByName(id:Long, name:String)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/delete/$id<[^/]+>""","""@controllers.UserController@.deleteUser(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/getAllUsers/json""","""@controllers.UserController@.getAllUsers(format:String = "json")"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/delete/userName/$userName<[^/]+>/password/$password<[^/]+>""","""@controllers.UserController@.deleteUserByUserNameandPassword(userName:String, password:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/register""","""@controllers.UserController@.userRegister"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/login""","""@controllers.UserController@.userLogin"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/search/$display_name<[^/]+>/json""","""@controllers.UserController@.userSearch(display_name:String, format:String = "json")"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/setprofile/$id<[^/]+>""","""@controllers.UserController@.setProfile(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/getprofile/$id<[^/]+>/json""","""@controllers.UserController@.getProfile(id:Long, format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/follow/followerId/$followerId<[^/]+>/followeeId/$followeeId<[^/]+>""","""@controllers.UserController@.userFollow(followerId:Long, followeeId:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/unfollow/followerId/$followerId<[^/]+>/followeeId/$followeeId<[^/]+>""","""@controllers.UserController@.userUnfollow(followerId:Long, followeeId:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/getFollowers/$id<[^/]+>""","""@controllers.UserController@.getFollowers(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/getFollowees/$id<[^/]+>""","""@controllers.UserController@.getFollowees(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/sendFriendRequest/sender/$senderId<[^/]+>/receiver/$receiverId<[^/]+>""","""@controllers.UserController@.sendFriendRequest(senderId:Long, receiverId:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/getFriendRequests/userId/$userId<[^/]+>""","""@controllers.UserController@.getFriendRequests(userId:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/acceptFriendRequest/userId/$userId<[^/]+>/sender/$senderId<[^/]+>""","""@controllers.UserController@.acceptFriendRequest(userId:Long, senderId:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/rejectFriendRequest/userId/$userId<[^/]+>/sender/$senderId<[^/]+>""","""@controllers.UserController@.rejectFriendRequest(userId:Long, senderId:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/getFriends/userId/$userId<[^/]+>""","""@controllers.UserController@.getFriends(userId:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/deleteFriend/userId/$userId<[^/]+>/friendId/$friendId<[^/]+>""","""@controllers.UserController@.deleteFriend(userId:Long, friendId:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/post""","""@controllers.WorkflowController@.post"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/updateWorkflow""","""@controllers.WorkflowController@.updateWorkflow"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/deleteWorkflow""","""@controllers.WorkflowController@.deleteWorkflow"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/get/workflowID/$wfID<[^/]+>/userID/$userID<[^/]+>/json""","""@controllers.WorkflowController@.get(wfID:Long, userID:Long, format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/getTimeline/$id<[^/]+>/offset/$offset<[^/]+>/json""","""@controllers.WorkflowController@.getTimeLine(id:Long, offset:Long, format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/getWorkflowList/$id<[^/]+>/json""","""@controllers.WorkflowController@.getWorkflowList(id:Long, format:String = "json")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/uploadImage/$id<[^/]+>""","""@controllers.WorkflowController@.uploadImage(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/getPublicWorkflow/json""","""@controllers.WorkflowController@.getPublicWorkflow(format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/getTags/workflowId/$wfId<[^/]+>""","""@controllers.WorkflowController@.getTags(wfId:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/setTag""","""@controllers.WorkflowController@.setTag"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/deleteTag/workflowId/$wfId<[^/]+>/tag/$tag<[^/]+>""","""@controllers.WorkflowController@.deleteTag(wfId:Long, tag:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/getByTag/tag/$tag<[^/]+>""","""@controllers.WorkflowController@.getByTag(tag:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/getByTitle/title/$title<[^/]+>""","""@controllers.WorkflowController@.getByTitle(title:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/getTop3WorkFlow""","""@controllers.WorkflowController@.getTop3WorkFlow()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mail/sendMail""","""@controllers.MailController@.sendMail"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mail/getMailDetail/mailId/$mailId<[^/]+>""","""@controllers.MailController@.readMail(mailId:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mail/getInbox/$id<[^/]+>/json""","""@controllers.MailController@.getInbox(id:Long, format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mail/getOutbox/$id<[^/]+>/json""","""@controllers.MailController@.getOutbox(id:Long, format:String = "json")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """suggestion/publishSuggestion""","""@controllers.SuggestionsController@.publishSuggestion"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """suggestion/addTag""","""@controllers.SuggestionsController@.addTag"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """suggestion/voteToSuggestion/$suggestionId<[^/]+>""","""@controllers.SuggestionsController@.voteToSuggestion(suggestionId:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """suggestion/getSuggestionForWorkflow/$workflowId<[^/]+>""","""@controllers.SuggestionsController@.getSuggestionForWorkflow(workflowId:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tag/createTag""","""@controllers.TagController@.createTag"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tag/deleteTag""","""@controllers.TagController@.deleteTag"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """group/createGroup""","""@controllers.GroupUsersController@.createGroup"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """group/addMembersToGroup""","""@controllers.GroupUsersController@.addMembersToGroup"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """group/getGroupList/$userID<[^/]+>/json""","""@controllers.GroupUsersController@.getGroupList(userID:Long, format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """group/getGroupMember/$groupId<[^/]+>/json""","""@controllers.GroupUsersController@.getGroupMember(groupId:Long, format:String = "json")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/", file:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/addComment""","""@controllers.WorkflowController@.addComment"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """workflow/getComments/$workflowId<[^/]+>""","""@controllers.WorkflowController@.getComments(workflowId:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Comment/addReply""","""@controllers.CommentController@.addReply"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Comment/getReply/$commentId<[^/]+>""","""@controllers.CommentController@.getReply(commentId:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Comment/getReply/$commentId<[^/]+>""","""@controllers.CommentController@.getReply(commentId:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Comment/thumbUp/$commentId<[^/]+>""","""@controllers.CommentController@.thumbUp(commentId:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Comment/thumbDown/$commentId<[^/]+>""","""@controllers.CommentController@.thumbDown(commentId:Long)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:10
case controllers_ClimateServiceController_getClimateService0_route(params) => {
   call(params.fromPath[String]("name", None), Param[String]("format", Right("json"))) { (name, format) =>
        controllers_ClimateServiceController_getClimateService0_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getClimateService(name, format))
   }
}
        

// @LINE:11
case controllers_ClimateServiceController_getClimateServiceById1_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ClimateServiceController_getClimateServiceById1_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getClimateServiceById(id))
   }
}
        

// @LINE:12
case controllers_ClimateServiceController_getAllClimateServices2_route(params) => {
   call(Param[String]("format", Right("json"))) { (format) =>
        controllers_ClimateServiceController_getAllClimateServices2_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllClimateServices(format))
   }
}
        

// @LINE:13
case controllers_ClimateServiceController_getAllClimateServicesOrderByCreateTime3_route(params) => {
   call(Param[String]("format", Right("json"))) { (format) =>
        controllers_ClimateServiceController_getAllClimateServicesOrderByCreateTime3_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllClimateServicesOrderByCreateTime(format))
   }
}
        

// @LINE:14
case controllers_ClimateServiceController_getAllClimateServicesOrderByLatestAccessTime4_route(params) => {
   call(Param[String]("format", Right("json"))) { (format) =>
        controllers_ClimateServiceController_getAllClimateServicesOrderByLatestAccessTime4_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllClimateServicesOrderByLatestAccessTime(format))
   }
}
        

// @LINE:15
case controllers_ClimateServiceController_getAllClimateServicesOrderByCount5_route(params) => {
   call(Param[String]("format", Right("json"))) { (format) =>
        controllers_ClimateServiceController_getAllClimateServicesOrderByCount5_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllClimateServicesOrderByCount(format))
   }
}
        

// @LINE:16
case controllers_ClimateServiceController_addClimateService6_route(params) => {
   call { 
        controllers_ClimateServiceController_addClimateService6_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).addClimateService)
   }
}
        

// @LINE:17
case controllers_ClimateServiceController_getAllServiceEntries7_route(params) => {
   call(Param[String]("format", Right("json"))) { (format) =>
        controllers_ClimateServiceController_getAllServiceEntries7_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllServiceEntries(format))
   }
}
        

// @LINE:18
case controllers_ClimateServiceController_addServiceEntry8_route(params) => {
   call { 
        controllers_ClimateServiceController_addServiceEntry8_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).addServiceEntry)
   }
}
        

// @LINE:19
case controllers_ClimateServiceController_updateClimateServiceById9_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ClimateServiceController_updateClimateServiceById9_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).updateClimateServiceById(id))
   }
}
        

// @LINE:20
case controllers_ClimateServiceController_updateClimateServiceByName10_route(params) => {
   call(params.fromPath[String]("oldName", None)) { (oldName) =>
        controllers_ClimateServiceController_updateClimateServiceByName10_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).updateClimateServiceByName(oldName))
   }
}
        

// @LINE:21
case controllers_ClimateServiceController_deleteClimateServiceById11_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ClimateServiceController_deleteClimateServiceById11_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).deleteClimateServiceById(id))
   }
}
        

// @LINE:22
case controllers_ClimateServiceController_deleteClimateServiceByName12_route(params) => {
   call(params.fromPath[String]("name", None)) { (name) =>
        controllers_ClimateServiceController_deleteClimateServiceByName12_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).deleteClimateServiceByName(name))
   }
}
        

// @LINE:25
case controllers_InstrumentController_getAllInstruments13_route(params) => {
   call(Param[String]("format", Right("json"))) { (format) =>
        controllers_InstrumentController_getAllInstruments13_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).getAllInstruments(format))
   }
}
        

// @LINE:26
case controllers_InstrumentController_getInstrument14_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_InstrumentController_getInstrument14_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).getInstrument(id, format))
   }
}
        

// @LINE:27
case controllers_InstrumentController_addInstrument15_route(params) => {
   call { 
        controllers_InstrumentController_addInstrument15_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).addInstrument)
   }
}
        

// @LINE:28
case controllers_InstrumentController_updateInstrumentById16_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_InstrumentController_updateInstrumentById16_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).updateInstrumentById(id))
   }
}
        

// @LINE:29
case controllers_InstrumentController_deleteInstrument17_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_InstrumentController_deleteInstrument17_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).deleteInstrument(id))
   }
}
        

// @LINE:32
case controllers_DatasetController_getAllDatasets18_route(params) => {
   call(Param[String]("format", Right("json"))) { (format) =>
        controllers_DatasetController_getAllDatasets18_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).getAllDatasets(format))
   }
}
        

// @LINE:33
case controllers_DatasetController_getDataset19_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_DatasetController_getDataset19_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).getDataset(id, format))
   }
}
        

// @LINE:34
case controllers_DatasetController_addDataset20_route(params) => {
   call { 
        controllers_DatasetController_addDataset20_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).addDataset)
   }
}
        

// @LINE:35
case controllers_DatasetController_updateDatasetById21_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DatasetController_updateDatasetById21_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).updateDatasetById(id))
   }
}
        

// @LINE:36
case controllers_DatasetController_deleteDataset22_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DatasetController_deleteDataset22_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).deleteDataset(id))
   }
}
        

// @LINE:37
case controllers_DatasetController_queryDatasets23_route(params) => {
   call { 
        controllers_DatasetController_queryDatasets23_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).queryDatasets)
   }
}
        

// @LINE:40
case controllers_ParameterController_getAllParameters24_route(params) => {
   call(Param[String]("format", Right("json"))) { (format) =>
        controllers_ParameterController_getAllParameters24_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).getAllParameters(format))
   }
}
        

// @LINE:41
case controllers_ParameterController_getParameterByName25_route(params) => {
   call(params.fromPath[Long]("id", None), params.fromPath[String]("name", None), Param[String]("format", Right("json"))) { (id, name, format) =>
        controllers_ParameterController_getParameterByName25_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).getParameterByName(id, name, format))
   }
}
        

// @LINE:42
case controllers_ParameterController_getParameterById26_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_ParameterController_getParameterById26_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).getParameterById(id, format))
   }
}
        

// @LINE:43
case controllers_ParameterController_addParameter27_route(params) => {
   call { 
        controllers_ParameterController_addParameter27_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).addParameter)
   }
}
        

// @LINE:44
case controllers_ParameterController_updateParameterById28_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ParameterController_updateParameterById28_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).updateParameterById(id))
   }
}
        

// @LINE:45
case controllers_ParameterController_updateParameterByName29_route(params) => {
   call(params.fromPath[String]("oldName", None)) { (oldName) =>
        controllers_ParameterController_updateParameterByName29_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).updateParameterByName(oldName))
   }
}
        

// @LINE:46
case controllers_ParameterController_deleteParameterByName30_route(params) => {
   call(params.fromPath[Long]("id", None), params.fromPath[String]("name", None)) { (id, name) =>
        controllers_ParameterController_deleteParameterByName30_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).deleteParameterByName(id, name))
   }
}
        

// @LINE:49
case controllers_UserController_deleteUser31_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserController_deleteUser31_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).deleteUser(id))
   }
}
        

// @LINE:50
case controllers_UserController_getAllUsers32_route(params) => {
   call(Param[String]("format", Right("json"))) { (format) =>
        controllers_UserController_getAllUsers32_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getAllUsers(format))
   }
}
        

// @LINE:51
case controllers_UserController_deleteUserByUserNameandPassword33_route(params) => {
   call(params.fromPath[String]("userName", None), params.fromPath[String]("password", None)) { (userName, password) =>
        controllers_UserController_deleteUserByUserNameandPassword33_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).deleteUserByUserNameandPassword(userName, password))
   }
}
        

// @LINE:53
case controllers_UserController_userRegister34_route(params) => {
   call { 
        controllers_UserController_userRegister34_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).userRegister)
   }
}
        

// @LINE:54
case controllers_UserController_userLogin35_route(params) => {
   call { 
        controllers_UserController_userLogin35_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).userLogin)
   }
}
        

// @LINE:56
case controllers_UserController_userSearch36_route(params) => {
   call(params.fromPath[String]("display_name", None), Param[String]("format", Right("json"))) { (display_name, format) =>
        controllers_UserController_userSearch36_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).userSearch(display_name, format))
   }
}
        

// @LINE:58
case controllers_UserController_setProfile37_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserController_setProfile37_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).setProfile(id))
   }
}
        

// @LINE:59
case controllers_UserController_getProfile38_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_UserController_getProfile38_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getProfile(id, format))
   }
}
        

// @LINE:61
case controllers_UserController_userFollow39_route(params) => {
   call(params.fromPath[Long]("followerId", None), params.fromPath[Long]("followeeId", None)) { (followerId, followeeId) =>
        controllers_UserController_userFollow39_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).userFollow(followerId, followeeId))
   }
}
        

// @LINE:62
case controllers_UserController_userUnfollow40_route(params) => {
   call(params.fromPath[Long]("followerId", None), params.fromPath[Long]("followeeId", None)) { (followerId, followeeId) =>
        controllers_UserController_userUnfollow40_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).userUnfollow(followerId, followeeId))
   }
}
        

// @LINE:63
case controllers_UserController_getFollowers41_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserController_getFollowers41_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getFollowers(id))
   }
}
        

// @LINE:64
case controllers_UserController_getFollowees42_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserController_getFollowees42_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getFollowees(id))
   }
}
        

// @LINE:66
case controllers_UserController_sendFriendRequest43_route(params) => {
   call(params.fromPath[Long]("senderId", None), params.fromPath[Long]("receiverId", None)) { (senderId, receiverId) =>
        controllers_UserController_sendFriendRequest43_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).sendFriendRequest(senderId, receiverId))
   }
}
        

// @LINE:67
case controllers_UserController_getFriendRequests44_route(params) => {
   call(params.fromPath[Long]("userId", None)) { (userId) =>
        controllers_UserController_getFriendRequests44_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getFriendRequests(userId))
   }
}
        

// @LINE:68
case controllers_UserController_acceptFriendRequest45_route(params) => {
   call(params.fromPath[Long]("userId", None), params.fromPath[Long]("senderId", None)) { (userId, senderId) =>
        controllers_UserController_acceptFriendRequest45_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).acceptFriendRequest(userId, senderId))
   }
}
        

// @LINE:69
case controllers_UserController_rejectFriendRequest46_route(params) => {
   call(params.fromPath[Long]("userId", None), params.fromPath[Long]("senderId", None)) { (userId, senderId) =>
        controllers_UserController_rejectFriendRequest46_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).rejectFriendRequest(userId, senderId))
   }
}
        

// @LINE:70
case controllers_UserController_getFriends47_route(params) => {
   call(params.fromPath[Long]("userId", None)) { (userId) =>
        controllers_UserController_getFriends47_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getFriends(userId))
   }
}
        

// @LINE:71
case controllers_UserController_deleteFriend48_route(params) => {
   call(params.fromPath[Long]("userId", None), params.fromPath[Long]("friendId", None)) { (userId, friendId) =>
        controllers_UserController_deleteFriend48_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).deleteFriend(userId, friendId))
   }
}
        

// @LINE:75
case controllers_WorkflowController_post49_route(params) => {
   call { 
        controllers_WorkflowController_post49_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).post)
   }
}
        

// @LINE:76
case controllers_WorkflowController_updateWorkflow50_route(params) => {
   call { 
        controllers_WorkflowController_updateWorkflow50_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).updateWorkflow)
   }
}
        

// @LINE:77
case controllers_WorkflowController_deleteWorkflow51_route(params) => {
   call { 
        controllers_WorkflowController_deleteWorkflow51_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).deleteWorkflow)
   }
}
        

// @LINE:78
case controllers_WorkflowController_get52_route(params) => {
   call(params.fromPath[Long]("wfID", None), params.fromPath[Long]("userID", None), Param[String]("format", Right("json"))) { (wfID, userID, format) =>
        controllers_WorkflowController_get52_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).get(wfID, userID, format))
   }
}
        

// @LINE:79
case controllers_WorkflowController_getTimeLine53_route(params) => {
   call(params.fromPath[Long]("id", None), params.fromPath[Long]("offset", None), Param[String]("format", Right("json"))) { (id, offset, format) =>
        controllers_WorkflowController_getTimeLine53_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getTimeLine(id, offset, format))
   }
}
        

// @LINE:80
case controllers_WorkflowController_getWorkflowList54_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_WorkflowController_getWorkflowList54_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getWorkflowList(id, format))
   }
}
        

// @LINE:81
case controllers_WorkflowController_uploadImage55_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WorkflowController_uploadImage55_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).uploadImage(id))
   }
}
        

// @LINE:82
case controllers_WorkflowController_getPublicWorkflow56_route(params) => {
   call(Param[String]("format", Right("json"))) { (format) =>
        controllers_WorkflowController_getPublicWorkflow56_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getPublicWorkflow(format))
   }
}
        

// @LINE:84
case controllers_WorkflowController_getTags57_route(params) => {
   call(params.fromPath[Long]("wfId", None)) { (wfId) =>
        controllers_WorkflowController_getTags57_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getTags(wfId))
   }
}
        

// @LINE:85
case controllers_WorkflowController_setTag58_route(params) => {
   call { 
        controllers_WorkflowController_setTag58_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).setTag)
   }
}
        

// @LINE:86
case controllers_WorkflowController_deleteTag59_route(params) => {
   call(params.fromPath[Long]("wfId", None), params.fromPath[String]("tag", None)) { (wfId, tag) =>
        controllers_WorkflowController_deleteTag59_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).deleteTag(wfId, tag))
   }
}
        

// @LINE:87
case controllers_WorkflowController_getByTag60_route(params) => {
   call(params.fromPath[String]("tag", None)) { (tag) =>
        controllers_WorkflowController_getByTag60_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getByTag(tag))
   }
}
        

// @LINE:88
case controllers_WorkflowController_getByTitle61_route(params) => {
   call(params.fromPath[String]("title", None)) { (title) =>
        controllers_WorkflowController_getByTitle61_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getByTitle(title))
   }
}
        

// @LINE:89
case controllers_WorkflowController_getTop3WorkFlow62_route(params) => {
   call { 
        controllers_WorkflowController_getTop3WorkFlow62_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getTop3WorkFlow())
   }
}
        

// @LINE:92
case controllers_MailController_sendMail63_route(params) => {
   call { 
        controllers_MailController_sendMail63_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.MailController]).sendMail)
   }
}
        

// @LINE:93
case controllers_MailController_readMail64_route(params) => {
   call(params.fromPath[Long]("mailId", None)) { (mailId) =>
        controllers_MailController_readMail64_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.MailController]).readMail(mailId))
   }
}
        

// @LINE:94
case controllers_MailController_getInbox65_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_MailController_getInbox65_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.MailController]).getInbox(id, format))
   }
}
        

// @LINE:95
case controllers_MailController_getOutbox66_route(params) => {
   call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_MailController_getOutbox66_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.MailController]).getOutbox(id, format))
   }
}
        

// @LINE:98
case controllers_SuggestionsController_publishSuggestion67_route(params) => {
   call { 
        controllers_SuggestionsController_publishSuggestion67_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.SuggestionsController]).publishSuggestion)
   }
}
        

// @LINE:99
case controllers_SuggestionsController_addTag68_route(params) => {
   call { 
        controllers_SuggestionsController_addTag68_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.SuggestionsController]).addTag)
   }
}
        

// @LINE:100
case controllers_SuggestionsController_voteToSuggestion69_route(params) => {
   call(params.fromPath[Long]("suggestionId", None)) { (suggestionId) =>
        controllers_SuggestionsController_voteToSuggestion69_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.SuggestionsController]).voteToSuggestion(suggestionId))
   }
}
        

// @LINE:101
case controllers_SuggestionsController_getSuggestionForWorkflow70_route(params) => {
   call(params.fromPath[Long]("workflowId", None)) { (workflowId) =>
        controllers_SuggestionsController_getSuggestionForWorkflow70_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.SuggestionsController]).getSuggestionForWorkflow(workflowId))
   }
}
        

// @LINE:105
case controllers_TagController_createTag71_route(params) => {
   call { 
        controllers_TagController_createTag71_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.TagController]).createTag)
   }
}
        

// @LINE:106
case controllers_TagController_deleteTag72_route(params) => {
   call { 
        controllers_TagController_deleteTag72_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.TagController]).deleteTag)
   }
}
        

// @LINE:110
case controllers_GroupUsersController_createGroup73_route(params) => {
   call { 
        controllers_GroupUsersController_createGroup73_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.GroupUsersController]).createGroup)
   }
}
        

// @LINE:111
case controllers_GroupUsersController_addMembersToGroup74_route(params) => {
   call { 
        controllers_GroupUsersController_addMembersToGroup74_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.GroupUsersController]).addMembersToGroup)
   }
}
        

// @LINE:112
case controllers_GroupUsersController_getGroupList75_route(params) => {
   call(params.fromPath[Long]("userID", None), Param[String]("format", Right("json"))) { (userID, format) =>
        controllers_GroupUsersController_getGroupList75_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.GroupUsersController]).getGroupList(userID, format))
   }
}
        

// @LINE:113
case controllers_GroupUsersController_getGroupMember76_route(params) => {
   call(params.fromPath[Long]("groupId", None), Param[String]("format", Right("json"))) { (groupId, format) =>
        controllers_GroupUsersController_getGroupMember76_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.GroupUsersController]).getGroupMember(groupId, format))
   }
}
        

// @LINE:117
case controllers_Assets_at77_route(params) => {
   call(Param[String]("path", Right("/")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at77_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:122
case controllers_WorkflowController_addComment78_route(params) => {
   call { 
        controllers_WorkflowController_addComment78_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).addComment)
   }
}
        

// @LINE:123
case controllers_WorkflowController_getComments79_route(params) => {
   call(params.fromPath[Long]("workflowId", None)) { (workflowId) =>
        controllers_WorkflowController_getComments79_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.WorkflowController]).getComments(workflowId))
   }
}
        

// @LINE:125
case controllers_CommentController_addReply80_route(params) => {
   call { 
        controllers_CommentController_addReply80_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.CommentController]).addReply)
   }
}
        

// @LINE:126
case controllers_CommentController_getReply81_route(params) => {
   call(params.fromPath[Long]("commentId", None)) { (commentId) =>
        controllers_CommentController_getReply81_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.CommentController]).getReply(commentId))
   }
}
        

// @LINE:127
case controllers_CommentController_getReply82_route(params) => {
   call(params.fromPath[Long]("commentId", None)) { (commentId) =>
        controllers_CommentController_getReply82_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.CommentController]).getReply(commentId))
   }
}
        

// @LINE:128
case controllers_CommentController_thumbUp83_route(params) => {
   call(params.fromPath[Long]("commentId", None)) { (commentId) =>
        controllers_CommentController_thumbUp83_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.CommentController]).thumbUp(commentId))
   }
}
        

// @LINE:129
case controllers_CommentController_thumbDown84_route(params) => {
   call(params.fromPath[Long]("commentId", None)) { (commentId) =>
        controllers_CommentController_thumbDown84_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.CommentController]).thumbDown(commentId))
   }
}
        
}

}
     