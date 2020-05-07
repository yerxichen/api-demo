package com.sjq.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.sjq.demo.entity.FmsFile;
import com.sjq.demo.service.FileService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/file")
@Api(tags = "file增删改查demo")
public class FileController {


    Logger logger = LoggerFactory.getLogger(FileController.class);

    @Autowired
    private FileService fileService;

    @ApiOperation(value = "查询全部file信息", notes = "查询全部file信息")
    @GetMapping("/getAllFiles")
    @ResponseBody
    public List<FmsFile> getAllFiles() {
        return fileService.getAllFiles();
    }


    @ApiOperation(value = "获取视频下载列表", notes = "获取视频下载列表")
    @GetMapping("/getXzlb")
    @ResponseBody
    public Object getXzlb() {
        String str="{\"code\":0,\"data\":[{\"CDBH\":\"03\",\"CLSD\":\"0\",\"CSYS\":\"Z\",\"CTHPTZZP\":\"\",\"CWKC\":\"0\",\"HPHM\":\"苏F12345$\",\"HPYS\":\"2\",\"HPZL\":\"02\",\"ID\":\"32068333000000082500000290701179264527\",\"JGSJ\":\"20190701152438\",\"JGSJD\":\"79809298847561\",\"JKSBBH\":\"320683330000000825000002\",\"KKBH\":\"320683330000000825\",\"LY\":\"\",\"QJZP\":\"http://10.36.1.71:8081/pic320/pic.php?http://172.23.168.173:8081/20190701{172.23.168.173}c/archivefile-2019-07-01-152327-000FEA6100001A9B120AA8C0:101756992/752924.jpg\",\"XSFX\":\"02\",\"YSSQ\":\"\",\"ZPSL\":\"1\",\"fx\":\"由南向北\",\"kkmc\":\"S225-陈酒北路\",\"timestamp\":\"20190701152438\"},{\"CDBH\":\"01\",\"CLSD\":\"0\",\"CSYS\":\"A\",\"CTHPTZZP\":\"\",\"CWKC\":\"0\",\"HPHM\":\"苏F12345$\",\"HPYS\":\"2\",\"HPZL\":\"02\",\"ID\":\"32068333000000237600000090701179264400\",\"JGSJ\":\"20190701152343\",\"JGSJD\":\"79809298847656\",\"JKSBBH\":\"320683330000002376000000\",\"KKBH\":\"320683330000002376\",\"LY\":\"\",\"QJZP\":\"http://10.36.1.71:8081/pic320/pic.php?http://172.23.168.174:8081/20190701{172.23.168.174}g/archivefile-2019-07-01-140922-003BFC0C000000F3130AA8C0:2304282688/861505.jpg\",\"XSFX\":\"00\",\"YSSQ\":\"\",\"ZPSL\":\"1\",\"fx\":\"由东向西\",\"kkmc\":\"225省道51Km725m\",\"timestamp\":\"20190701152343\"},{\"CDBH\":\"02\",\"CLSD\":\"0\",\"CSYS\":\"Z\",\"CTHPTZZP\":\"\",\"CWKC\":\"0\",\"HPHM\":\"苏F12345$\",\"HPYS\":\"2\",\"HPZL\":\"02\",\"ID\":\"32068333000000082700000190701179264137\",\"JGSJ\":\"20190701152321\",\"JGSJD\":\"79809298847678\",\"JKSBBH\":\"320683330000000827000001\",\"KKBH\":\"320683330000000827\",\"LY\":\"\",\"QJZP\":\"http://10.36.1.71:8081/pic320/pic.php?http://172.23.168.173:8081/20190701{172.23.168.173}h/archivefile-2019-07-01-152132-00E7516B00001A9F120AA8C0:128852032/437092.jpg\",\"XSFX\":\"02\",\"YSSQ\":\"\",\"ZPSL\":\"1\",\"fx\":\"由南向北\",\"kkmc\":\"S225-谢戚路\",\"timestamp\":\"20190701152321\"},{\"CDBH\":\"01\",\"CLSD\":\"0\",\"CSYS\":\"Z\",\"CTHPTZZP\":\"\",\"CWKC\":\"0\",\"HPHM\":\"苏F12345$\",\"HPYS\":\"2\",\"HPZL\":\"02\",\"ID\":\"32068333000000082900000190701179263591\",\"JGSJ\":\"20190701152139\",\"JGSJD\":\"79809298847860\",\"JKSBBH\":\"320683330000000829000001\",\"KKBH\":\"320683330000000829\",\"LY\":\"\",\"QJZP\":\"http://10.36.1.71:8081/pic320/pic.php?http://172.23.168.173:8081/20190701{172.23.168.173}d/archivefile-2019-07-01-142140-00DFF7DE00001AA0120AA8C0:4124614720/299156.jpg\",\"XSFX\":\"02\",\"YSSQ\":\"\",\"ZPSL\":\"1\",\"fx\":\"由南向北\",\"kkmc\":\"S225-海平线\",\"timestamp\":\"20190701152139\"},{\"CDBH\":\"01\",\"CLSD\":\"0\",\"CSYS\":\"Z\",\"CTHPTZZP\":\"\",\"CWKC\":\"0\",\"HPHM\":\"苏F12345$\",\"HPYS\":\"2\",\"HPZL\":\"02\",\"ID\":\"32068333000000320200000290701179263090\",\"JGSJ\":\"20190701152011\",\"JGSJD\":\"79809298847988\",\"JKSBBH\":\"320683330000003202000002\",\"KKBH\":\"320683330000003202\",\"LY\":\"\",\"QJZP\":\"http://10.36.1.71:8081/pic320/pic.php?http://172.23.168.173:8081/20190701{172.23.168.173}b/archivefile-2019-07-01-141908-007769A300001A9A120AA8C0:4233093184/309068.jpg\",\"XSFX\":\"02\",\"YSSQ\":\"\",\"ZPSL\":\"1\",\"fx\":\"由南向北\",\"kkmc\":\"S225龙盛大道\",\"timestamp\":\"20190701152011\"},{\"CDBH\":\"04\",\"CLSD\":\"0\",\"CSYS\":\"A\",\"CTHPTZZP\":\"\",\"CWKC\":\"0\",\"HPHM\":\"苏F12345$\",\"HPYS\":\"2\",\"HPZL\":\"02\",\"ID\":\"32068333000000224200000490701179262475\",\"JGSJ\":\"20190701151822\",\"JGSJD\":\"79809298848177\",\"JKSBBH\":\"320683330000002242000004\",\"KKBH\":\"320683330000002242\",\"LY\":\"\",\"QJZP\":\"http://10.36.1.71:8081/pic320/pic.php?http://172.23.168.172:8081/20190701{172.23.168.172}d/archivefile-2019-07-01-150811-000A7D2B000001B4110AA8C0:678654016/396111.jpg\",\"XSFX\":\"02\",\"YSSQ\":\"\",\"ZPSL\":\"1\",\"fx\":\"由南向北\",\"kkmc\":\"S225幸余路口\",\"timestamp\":\"20190701151822\"},{\"CDBH\":\"03\",\"CLSD\":\"0\",\"CSYS\":\"Z\",\"CTHPTZZP\":\"\",\"CWKC\":\"0\",\"HPHM\":\"苏F12345$\",\"HPYS\":\"2\",\"HPZL\":\"02\",\"ID\":\"32068333000000083900000190701179262234\",\"JGSJ\":\"20190701151733\",\"JGSJD\":\"79809298848266\",\"JKSBBH\":\"320683330000000839000001\",\"KKBH\":\"320683330000000839\",\"LY\":\"\",\"QJZP\":\"http://10.36.1.71:8081/pic320/pic.php?http://172.23.168.173:8081/20190701{172.23.168.173}d/archivefile-2019-07-01-142140-00DFF7DE00001AA0120AA8C0:3834679360/841252.jpg\",\"XSFX\":\"02\",\"YSSQ\":\"\",\"ZPSL\":\"1\",\"fx\":\"由南向北\",\"kkmc\":\"S225K20加216中心路口\",\"timestamp\":\"20190701151733\"},{\"CDBH\":\"01\",\"CLSD\":\"0\",\"CSYS\":\"\",\"CTHPTZZP\":\"\",\"CWKC\":\"0\",\"HPHM\":\"苏F12345$\",\"HPYS\":\"0\",\"HPZL\":\"02\",\"ID\":\"32060017000000093062019070107059253792\",\"JGSJ\":\"20190701151505\",\"JGSJD\":\"79809298848494\",\"JKSBBH\":\"320600170000009306000001\",\"KKBH\":\"320600170000009306\",\"LY\":\"\",\"QJZP\":\"http://10.36.1.71:8081/pic320/pic.php?http://172.23.169.40:8088/image/vrb2/i2/2fe505db58d442e083aa768931e69ac2/00029?key=6c02&offset=2808795460&high=507228\",\"XSFX\":\"01\",\"YSSQ\":\"\",\"ZPSL\":\"1\",\"fx\":\"由西向东\",\"kkmc\":\"江海大道通富路路口\",\"timestamp\":\"20190701151505\"},{\"CDBH\":\"01\",\"CLSD\":\"0\",\"CSYS\":\"\",\"CTHPTZZP\":\"\",\"CWKC\":\"0\",\"HPHM\":\"苏F12345$\",\"HPYS\":\"0\",\"HPZL\":\"02\",\"ID\":\"32060017000000090752019070107059125980\",\"JGSJ\":\"20190701150216\",\"JGSJD\":\"79809298849783\",\"JKSBBH\":\"320600170000009075000001\",\"KKBH\":\"320600170000009075\",\"LY\":\"\",\"QJZP\":\"http://10.36.1.71:8081/pic320/pic.php?http://172.23.169.111:8088/image/vrb2/i2/9f4cc252b44242bbaf411f88cb189f53/00054?key=1b40&offset=1927221192&high=174100\",\"XSFX\":\"02\",\"YSSQ\":\"\",\"ZPSL\":\"1\",\"fx\":\"由南向北\",\"kkmc\":\"濠北路濠西路路口\",\"timestamp\":\"20190701150216\"},{\"CDBH\":\"01\",\"CLSD\":\"0\",\"CSYS\":\"\",\"CTHPTZZP\":\"\",\"CWKC\":\"0\",\"HPHM\":\"苏F12345$\",\"HPYS\":\"0\",\"HPZL\":\"02\",\"ID\":\"32060017000000092312019070107059079336\",\"JGSJ\":\"20190701145658\",\"JGSJD\":\"79809298854341\",\"JKSBBH\":\"320600170000009231000001\",\"KKBH\":\"320600170000009231\",\"LY\":\"\",\"QJZP\":\"http://10.36.1.71:8081/pic320/pic.php?http://172.23.169.80:8088/image/vrb2/i2/b5cef725f7784bfa925532000714370a/00036?key=2f5e&offset=1298221662&high=472416\",\"XSFX\":\"03\",\"YSSQ\":\"\",\"ZPSL\":\"1\",\"fx\":\"由北向南\",\"kkmc\":\"桃坞路跃龙路路口\",\"timestamp\":\"20190701145658\"},{\"CDBH\":\"03\",\"CLSD\":\"0\",\"CSYS\":\"Z\",\"CTHPTZZP\":\"\",\"CWKC\":\"0\",\"HPHM\":\"苏F12345$\",\"HPYS\":\"2\",\"HPZL\":\"02\",\"ID\":\"32068333000000082500000290701179264527\",\"JGSJ\":\"20190701152438\",\"JGSJD\":\"79809298847561\",\"JKSBBH\":\"320683330000000825000002\",\"KKBH\":\"320683330000000825\",\"LY\":\"\",\"QJZP\":\"http://10.36.1.71:8081/pic320/pic.php?http://172.23.168.173:8081/20190701{172.23.168.173}c/archivefile-2019-07-01-152327-000FEA6100001A9B120AA8C0:101756992/752924.jpg\",\"XSFX\":\"02\",\"YSSQ\":\"\",\"ZPSL\":\"1\",\"fx\":\"由南向北\",\"kkmc\":\"S225-陈酒北路\",\"timestamp\":\"20190701152438\"},{\"CDBH\":\"01\",\"CLSD\":\"0\",\"CSYS\":\"A\",\"CTHPTZZP\":\"\",\"CWKC\":\"0\",\"HPHM\":\"苏F12345$\",\"HPYS\":\"2\",\"HPZL\":\"02\",\"ID\":\"32068333000000237600000090701179264400\",\"JGSJ\":\"20190701152343\",\"JGSJD\":\"79809298847656\",\"JKSBBH\":\"320683330000002376000000\",\"KKBH\":\"320683330000002376\",\"LY\":\"\",\"QJZP\":\"http://10.36.1.71:8081/pic320/pic.php?http://172.23.168.174:8081/20190701{172.23.168.174}g/archivefile-2019-07-01-140922-003BFC0C000000F3130AA8C0:2304282688/861505.jpg\",\"XSFX\":\"00\",\"YSSQ\":\"\",\"ZPSL\":\"1\",\"fx\":\"由东向西\",\"kkmc\":\"225省道51Km725m\",\"timestamp\":\"20190701152343\"},{\"CDBH\":\"02\",\"CLSD\":\"0\",\"CSYS\":\"Z\",\"CTHPTZZP\":\"\",\"CWKC\":\"0\",\"HPHM\":\"苏F12345$\",\"HPYS\":\"2\",\"HPZL\":\"02\",\"ID\":\"32068333000000082700000190701179264137\",\"JGSJ\":\"20190701152321\",\"JGSJD\":\"79809298847678\",\"JKSBBH\":\"320683330000000827000001\",\"KKBH\":\"320683330000000827\",\"LY\":\"\",\"QJZP\":\"http://10.36.1.71:8081/pic320/pic.php?http://172.23.168.173:8081/20190701{172.23.168.173}h/archivefile-2019-07-01-152132-00E7516B00001A9F120AA8C0:128852032/437092.jpg\",\"XSFX\":\"02\",\"YSSQ\":\"\",\"ZPSL\":\"1\",\"fx\":\"由南向北\",\"kkmc\":\"S225-谢戚路\",\"timestamp\":\"20190701152321\"},{\"CDBH\":\"01\",\"CLSD\":\"0\",\"CSYS\":\"Z\",\"CTHPTZZP\":\"\",\"CWKC\":\"0\",\"HPHM\":\"苏F12345$\",\"HPYS\":\"2\",\"HPZL\":\"02\",\"ID\":\"32068333000000082900000190701179263591\",\"JGSJ\":\"20190701152139\",\"JGSJD\":\"79809298847860\",\"JKSBBH\":\"320683330000000829000001\",\"KKBH\":\"320683330000000829\",\"LY\":\"\",\"QJZP\":\"http://10.36.1.71:8081/pic320/pic.php?http://172.23.168.173:8081/20190701{172.23.168.173}d/archivefile-2019-07-01-142140-00DFF7DE00001AA0120AA8C0:4124614720/299156.jpg\",\"XSFX\":\"02\",\"YSSQ\":\"\",\"ZPSL\":\"1\",\"fx\":\"由南向北\",\"kkmc\":\"S225-海平线\",\"timestamp\":\"20190701152139\"},{\"CDBH\":\"01\",\"CLSD\":\"0\",\"CSYS\":\"Z\",\"CTHPTZZP\":\"\",\"CWKC\":\"0\",\"HPHM\":\"苏F12345$\",\"HPYS\":\"2\",\"HPZL\":\"02\",\"ID\":\"32068333000000320200000290701179263090\",\"JGSJ\":\"20190701152011\",\"JGSJD\":\"79809298847988\",\"JKSBBH\":\"320683330000003202000002\",\"KKBH\":\"320683330000003202\",\"LY\":\"\",\"QJZP\":\"http://10.36.1.71:8081/pic320/pic.php?http://172.23.168.173:8081/20190701{172.23.168.173}b/archivefile-2019-07-01-141908-007769A300001A9A120AA8C0:4233093184/309068.jpg\",\"XSFX\":\"02\",\"YSSQ\":\"\",\"ZPSL\":\"1\",\"fx\":\"由南向北\",\"kkmc\":\"S225龙盛大道\",\"timestamp\":\"20190701152011\"},{\"CDBH\":\"04\",\"CLSD\":\"0\",\"CSYS\":\"A\",\"CTHPTZZP\":\"\",\"CWKC\":\"0\",\"HPHM\":\"苏F12345$\",\"HPYS\":\"2\",\"HPZL\":\"02\",\"ID\":\"32068333000000224200000490701179262475\",\"JGSJ\":\"20190701151822\",\"JGSJD\":\"79809298848177\",\"JKSBBH\":\"320683330000002242000004\",\"KKBH\":\"320683330000002242\",\"LY\":\"\",\"QJZP\":\"http://10.36.1.71:8081/pic320/pic.php?http://172.23.168.172:8081/20190701{172.23.168.172}d/archivefile-2019-07-01-150811-000A7D2B000001B4110AA8C0:678654016/396111.jpg\",\"XSFX\":\"02\",\"YSSQ\":\"\",\"ZPSL\":\"1\",\"fx\":\"由南向北\",\"kkmc\":\"S225幸余路口\",\"timestamp\":\"20190701151822\"},{\"CDBH\":\"03\",\"CLSD\":\"0\",\"CSYS\":\"Z\",\"CTHPTZZP\":\"\",\"CWKC\":\"0\",\"HPHM\":\"苏F12345$\",\"HPYS\":\"2\",\"HPZL\":\"02\",\"ID\":\"32068333000000083900000190701179262234\",\"JGSJ\":\"20190701151733\",\"JGSJD\":\"79809298848266\",\"JKSBBH\":\"320683330000000839000001\",\"KKBH\":\"320683330000000839\",\"LY\":\"\",\"QJZP\":\"http://10.36.1.71:8081/pic320/pic.php?http://172.23.168.173:8081/20190701{172.23.168.173}d/archivefile-2019-07-01-142140-00DFF7DE00001AA0120AA8C0:3834679360/841252.jpg\",\"XSFX\":\"02\",\"YSSQ\":\"\",\"ZPSL\":\"1\",\"fx\":\"由南向北\",\"kkmc\":\"S225K20加216中心路口\",\"timestamp\":\"20190701151733\"},{\"CDBH\":\"01\",\"CLSD\":\"0\",\"CSYS\":\"\",\"CTHPTZZP\":\"\",\"CWKC\":\"0\",\"HPHM\":\"苏F12345$\",\"HPYS\":\"0\",\"HPZL\":\"02\",\"ID\":\"32060017000000093062019070107059253792\",\"JGSJ\":\"20190701151505\",\"JGSJD\":\"79809298848494\",\"JKSBBH\":\"320600170000009306000001\",\"KKBH\":\"320600170000009306\",\"LY\":\"\",\"QJZP\":\"http://10.36.1.71:8081/pic320/pic.php?http://172.23.169.40:8088/image/vrb2/i2/2fe505db58d442e083aa768931e69ac2/00029?key=6c02&offset=2808795460&high=507228\",\"XSFX\":\"01\",\"YSSQ\":\"\",\"ZPSL\":\"1\",\"fx\":\"由西向东\",\"kkmc\":\"江海大道通富路路口\",\"timestamp\":\"20190701151505\"},{\"CDBH\":\"01\",\"CLSD\":\"0\",\"CSYS\":\"\",\"CTHPTZZP\":\"\",\"CWKC\":\"0\",\"HPHM\":\"苏F12345$\",\"HPYS\":\"0\",\"HPZL\":\"02\",\"ID\":\"32060017000000090752019070107059125980\",\"JGSJ\":\"20190701150216\",\"JGSJD\":\"79809298849783\",\"JKSBBH\":\"320600170000009075000001\",\"KKBH\":\"320600170000009075\",\"LY\":\"\",\"QJZP\":\"http://10.36.1.71:8081/pic320/pic.php?http://172.23.169.111:8088/image/vrb2/i2/9f4cc252b44242bbaf411f88cb189f53/00054?key=1b40&offset=1927221192&high=174100\",\"XSFX\":\"02\",\"YSSQ\":\"\",\"ZPSL\":\"1\",\"fx\":\"由南向北\",\"kkmc\":\"濠北路濠西路路口\",\"timestamp\":\"20190701150216\"},{\"CDBH\":\"01\",\"CLSD\":\"0\",\"CSYS\":\"\",\"CTHPTZZP\":\"\",\"CWKC\":\"0\",\"HPHM\":\"苏F12345$\",\"HPYS\":\"0\",\"HPZL\":\"02\",\"ID\":\"32060017000000092312019070107059079336\",\"JGSJ\":\"20190701145658\",\"JGSJD\":\"79809298854341\",\"JKSBBH\":\"320600170000009231000001\",\"KKBH\":\"320600170000009231\",\"LY\":\"\",\"QJZP\":\"http://10.36.1.71:8081/pic320/pic.php?http://172.23.169.80:8088/image/vrb2/i2/b5cef725f7784bfa925532000714370a/00036?key=2f5e&offset=1298221662&high=472416\",\"XSFX\":\"03\",\"YSSQ\":\"\",\"ZPSL\":\"1\",\"fx\":\"由北向南\",\"kkmc\":\"f坞路跃龙路路口\",\"timestamp\":\"12190701145658\"}]}";
        return JSONObject.parse(str);

    }




}