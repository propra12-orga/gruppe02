import java.net.URL;
import java.applet.*;
public class Sound
{
private AudioClip[] sounds; // AudioClips
public Sound()
{
initSounds();
}
private void initSounds()
{
try
{
// needed for correct loading of resources in JAR-Files
ClassLoader loader = Sound.class.getClassLoader();
// load AudioClips
sounds = new AudioClip[2];
sounds[0] = Applet.newAudioClip(loader.getResource("sound.wav"));
sounds[1] = Applet.newAudioClip(loader.getResource("sound1.wav"));
}
catch (Exception ex)
{
ex.printStackTrace();
}
}
public void playSound(int index)
{
if (index>0 && index<sounds.length) sounds[index].play();
}
public static void main(String[] args)
{
Sound Sound = new Sound(); // initialize jukebox
Sound.playSound(0); // play first sound
try
{
Thread.sleep(100); // wait a bit
}
catch (InterruptedException ex) {}
Sound.playSound(1); // play second sound
}
}