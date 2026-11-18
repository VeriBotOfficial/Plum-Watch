# 表盘制作AAR介绍

## 1.需要在项目的Application中初始化表盘制作
    参考代码：
    WatchFaceImageUtil.getInstance().initWatchFaceImageData(mContext);

## 2.表盘所需的资源文件复制项目中，资源文件在aar包中的watchFace目录下需要复制到项目中，参考代码：
    // 检查外部存储是否可用
    public static void copyAssetsCheck(Context context) {
        Log.i(TAG, "copyAssetsCheck");
        if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {
            // ...
            copyAssetsToDir(context, "watchFace", filePath);
        }
    }

    // 复制assets目录下的文件到应用目录
    public static void copyAssetsToDir(Context context, String assetDir, String destDirPath) {
        Log.i(TAG, "copyAssetsToDir");
        // ...
    }

## 3.1.表盘制作准备

### 3.1.离线图片表盘
	表盘图片选中后，需要替换表盘背景图和表盘预览图，图片名称是bg.png和preview_img.png，
    参考代码：
    copyImageToAppDir(mContext, croppedUri, "bg.png");
    copyImageToAppDir(mContext, croppedUri, "preview_img.png");
    // 复制到应用目录下
    public static void copyImageToAppDir(Context context, Uri imageUri, String imageFileName) {
        Log.i(TAG, "copyImageToAppDir");
        // ...
    }

### 3.2.视频表盘
    1.视频文件转帧图片制作成表盘显示，设置帧图片的数量（当前是15张，也可以动态设置帧图片数量，图片数量越多视频越流畅，同时生成的表盘bin文件也越大）
    参考代码：
    for (int i = 1; i < 16; i++) {
        String name = "frame_" + i + ".png";
        imageNameList.add(name);
    }
    Log.i(TAG, "imageNameList: " + imageNameList.size());

    2.判断选中的视频文件大小，文件越大抽取的帧图片也大，会导致表盘bin文件过大，当前设置是视频大小不超过100MB，参考代码：
    long videoSize = VideoSizeUtils.getVideoSize(mContext, selectedVideo);
    Log.i(TAG, "videoSize byte: " + videoSize);
    videoSize = videoSize / 1024 / 1024; // 字节转换成MB
    Log.i(TAG, "videoSize MB: " + videoSize);
    if (videoSize > 100) {
        Log.e(TAG, "select video too big");
        show(mContext, "视频太大请重新选择");
        return;
    }
    
    3.抽取视频帧图片，第一帧图片为背景图和预览图，参考代码：
    getFrameImageToVideo(mContext, selectedVideo, 1 * 1000 * 1000, "bg.png");
    getFrameImageToVideo(mContext, selectedVideo, 1 * 1000 * 1000, "preview_img.png");
    List<String> imageNamePath = VideoFrameExtractor.extractVideoFrames(mContext, selectedVideo, imageNameList);
    aar包中有视频表抽取帧图片的工具类VideoFrameExtractor
    /**
     * 从视频URI提取帧图片并保存到应用私有目录
     *
     * @param context  上下文
     * @param videoUri 视频文件URI
     * @param timeUs 帧图片时间，单位是微秒，比如抽取1秒的帧图片，传入值是1 * 1000 * 1000
     * @param callback 返回保存帧图片成功和失败的回调
     */
    public static void extractFrame(Context context, Uri videoUri, long timeUs, String fileName, FrameExtractCallback callback) {}
    
    /**
     * 从视频URI提取帧图片并保存到应用私有目录
     *
     * @param context  上下文
     * @param videoUri 视频文件URI
     * @param names 帧图片名称集合
     * @return 保存的图片文件路径列表
     */
    public static List<String> extractVideoFrames(Context context, Uri videoUri, List<String> names) {}
    

## 4.表盘制作，传入参数，上下文，表盘资源文件xml的路径和输出文件的目录，调用aar包中的DialConvertTool类的convertXmlToOutput开始制作表盘，
    注意表盘制作是耗时的需要放在子线程中。
    参考代码：
    String filePath = getExternalFilesDir(null) + "/watchFace/watchFace.xml";
    String fileOutPath = getExternalFilesDir(null) + "/out";
    String mCompressedPath = fileOutPath + "/" + com.compress.utils.Utils.formatDate(12) + ".bin";
    makeWatchFace(mContext, filePath, mCompressedPath);
    /**
     * 表盘制作方法
     *
     * @param context  上下文
     * @param isVideo  是否视频表盘，true是视频表盘，false是离线图片表盘
     * @param filePath 表盘布局文件
     * @param outputDir 表盘输出目录
     */
    public static void makeWatchFace(Context context, boolean isVideo, String filePath, String outputDir) {
        Log.i(TAG, "makeWatch start compress");
        Executors.newSingleThreadExecutor().execute(() -> {
            Log.i(TAG, "Thread: " + Thread.currentThread().getName());
            File inputFile = new File(filePath);
            if (inputFile.exists() && inputFile.isFile() && filePath.toLowerCase().endsWith(".xml")) {
                new DialConvertTool().convertXmlToOutput(context, filePath, outputDir);
            }
        });
    }

## 5.表盘制作完成后，会发送eventbus通知依赖的项目表盘制作完成，返回的参数是watchFaceImageComplete，同时需要调用ImageConvertTool的clear方法清除已经制作的表盘的缓存数据，
    注意要在app的build.gradle中添加eventbus的依赖库用于接收表盘制作完成的通知。
    参考代码：
    @Subscribe()
    public void eventbusWatchFace(String msg) {
        Log.i(TAG, "eventbusWatchFace msg: " + msg);
        if ("watchFaceImageComplete".equals(msg)) {
            ImageConvertTool.getInstance().clear();
        }
    }
