package QR_Generat
//import java.nio.file.{FileSystem, filesystems}
import java.nio.file.FileSystems


import com.google.zxing.BarcodeFormat
import com.google.zxing.client.j2se.MatrixToImageWriter
import com.google.zxing.qrcode.QRCodeWriter


class QRtestBuild {

  private val path = "./qrcode.png"
  def QrCodeGen(text:String,width:Int, height:Int,filepath:String) :Unit ={

    println(text)
    val qrwriter = new QRCodeWriter()
    val bitMatrix = qrwriter.encode(text,BarcodeFormat.QR_CODE,width,height)
    val path1 =FileSystems.getDefault().getPath(path)
    println(path1)
    MatrixToImageWriter.writeToPath(bitMatrix, "png",path1)
  }

}
object QRcode {
  def main (args: Array[String]): Unit = {
    val qr = new QRtestBuild()
    qr.QrCodeGen(text = "hello", width = 350,height = 350, filepath = "./code")
  }
}
