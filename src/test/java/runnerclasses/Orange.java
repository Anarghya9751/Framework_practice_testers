package runnerclasses;



@Cucumberoptions(
        features = "src/test/featurefiles",
        glue = {"stepdeffiles"},
        plugin = {"pretty","html:target/index.html/report.html"}



)
public class Orange {
}
