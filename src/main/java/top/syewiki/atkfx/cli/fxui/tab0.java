package top.syewiki.atkfx.cli.fxui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class tab0 extends Application {

    @Override
    public void start(Stage primaryStage) {
        // 创建主布局
        BorderPane root = new BorderPane();

        // 创建侧边栏
        VBox sidebar = new VBox();
        sidebar.setSpacing(10);
        sidebar.setPadding(new Insets(10));
        sidebar.setStyle("-fx-background-color: #eeeeee;");

        // 创建三个按钮
        Button btn1 = new Button("Page 1");
        Button btn2 = new Button("Page 2");
        Button btn3 = new Button("Page 3");

        btn1.setPrefWidth(100);
        btn2.setPrefWidth(100);
        btn3.setPrefWidth(100);

        // 将按钮添加到侧边栏
        sidebar.getChildren().addAll(btn1, btn2, btn3);

        // 创建右侧区域的容器
        HBox contentArea = new HBox();
        contentArea.setPadding(new Insets(20));

        // 设置默认页面
        Text defaultPage = new Text("Welcome to the default page");
        contentArea.getChildren().add(defaultPage);

        // 为每个按钮设置点击事件，切换右侧区域的页面
        btn1.setOnAction(e -> showPage(contentArea, "This is Page 1"));
        btn2.setOnAction(e -> showPage(contentArea, "This is Page 2"));
        btn3.setOnAction(e -> showPage(contentArea, "This is Page 3"));

        // 将侧边栏添加到左侧，内容区域添加到中心
        root.setLeft(sidebar);
        root.setCenter(contentArea);

        // 创建场景并显示
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setTitle("Sidebar App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // 切换页面内容
    private void showPage(HBox contentArea, String text) {
        contentArea.getChildren().clear();  // 清空当前内容
        contentArea.getChildren().add(new Text(text));  // 显示新内容
    }

    public class main {
        public static void main(String[] args) {
            launch(args);
        }
    }

}

