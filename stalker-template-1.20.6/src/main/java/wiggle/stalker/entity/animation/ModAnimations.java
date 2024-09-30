package wiggle.stalker.entity.animation;

import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.render.entity.animation.AnimationHelper;
import net.minecraft.client.render.entity.animation.Keyframe;
import net.minecraft.client.render.entity.animation.Transformation;

public class ModAnimations {


    public static final Animation STALKER_IDLE = Animation.Builder.create(6f).looping()
            .addBoneAnimation("stalker",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, -1f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(3f, AnimationHelper.createRotationalVector(0f, 0f, 1f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(6f, AnimationHelper.createRotationalVector(0f, 0f, -1f),
                                    Transformation.Interpolations.CUBIC)))
            .addBoneAnimation("right_arm",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 5f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("right_leg",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 5f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("left_leg",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, -5f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("left_arm",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, -7.5f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("head",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(2f, AnimationHelper.createRotationalVector(0f, 0f, -1f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(4f, AnimationHelper.createRotationalVector(0f, 0f, 1f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(5.5f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(5.834333f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(5.875f, AnimationHelper.createRotationalVector(0f, 0f, 2.5f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(5.916767f, AnimationHelper.createRotationalVector(0f, 0f, -2.5f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(5.958343f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.CUBIC))).build();
    public static final Animation STALKER_RUN = Animation.Builder.create(1f).looping()
            .addBoneAnimation("stalker",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, -2.5f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.16766666f, AnimationHelper.createRotationalVector(0f, 0f, 2.5f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.3433333f, AnimationHelper.createRotationalVector(0f, 0f, -2.5f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.5f, AnimationHelper.createRotationalVector(0f, 0f, 2.5f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.6766666f, AnimationHelper.createRotationalVector(0f, 0f, -2.5f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.8343334f, AnimationHelper.createRotationalVector(0f, 0f, 2.5f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(1f, AnimationHelper.createRotationalVector(0f, 0f, -2.5f),
                                    Transformation.Interpolations.CUBIC)))
            .addBoneAnimation("right_arm",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(14.95f, -1.29f, 4.83f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.16766666f, AnimationHelper.createRotationalVector(-14.95f, 1.29f, 4.83f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.3433333f, AnimationHelper.createRotationalVector(14.95f, -1.29f, 4.83f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.5f, AnimationHelper.createRotationalVector(-14.95f, 1.29f, 4.83f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.6766666f, AnimationHelper.createRotationalVector(14.95f, -1.29f, 4.83f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.8343334f, AnimationHelper.createRotationalVector(-14.95f, 1.29f, 4.83f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(1f, AnimationHelper.createRotationalVector(14.95f, -1.29f, 4.83f),
                                    Transformation.Interpolations.CUBIC)))
            .addBoneAnimation("right_leg",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(-14.95f, 1.29f, 4.83f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.16766666f, AnimationHelper.createRotationalVector(14.95f, -1.29f, 4.83f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.3433333f, AnimationHelper.createRotationalVector(-14.95f, 1.29f, 4.83f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.5f, AnimationHelper.createRotationalVector(14.95f, -1.29f, 4.83f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.6766666f, AnimationHelper.createRotationalVector(-14.95f, 1.29f, 4.83f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.8343334f, AnimationHelper.createRotationalVector(14.95f, -1.29f, 4.83f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(1f, AnimationHelper.createRotationalVector(-14.95f, 1.29f, 4.83f),
                                    Transformation.Interpolations.CUBIC)))
            .addBoneAnimation("left_leg",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(14.95f, 1.29f, -4.83f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.16766666f, AnimationHelper.createRotationalVector(-14.95f, -1.29f, -4.83f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.3433333f, AnimationHelper.createRotationalVector(14.95f, 1.29f, -4.83f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.5f, AnimationHelper.createRotationalVector(-14.95f, -1.29f, -4.83f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.6766666f, AnimationHelper.createRotationalVector(14.95f, 1.29f, -4.83f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.8343334f, AnimationHelper.createRotationalVector(-14.95f, -1.29f, -4.83f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(1f, AnimationHelper.createRotationalVector(14.95f, 1.29f, -4.83f),
                                    Transformation.Interpolations.CUBIC)))
            .addBoneAnimation("left_arm",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(-14.95f, -1.29f, -4.83f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.16766666f, AnimationHelper.createRotationalVector(14.95f, 1.29f, -4.83f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.3433333f, AnimationHelper.createRotationalVector(-14.95f, -1.29f, -4.83f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.5f, AnimationHelper.createRotationalVector(14.95f, 1.29f, -4.83f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.6766666f, AnimationHelper.createRotationalVector(-14.95f, -1.29f, -4.83f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.8343334f, AnimationHelper.createRotationalVector(14.95f, 1.29f, -4.83f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(1f, AnimationHelper.createRotationalVector(-14.95f, -1.29f, -4.83f),
                                    Transformation.Interpolations.CUBIC)))
            .addBoneAnimation("head",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, -17.5f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.25f, AnimationHelper.createRotationalVector(0f, 0f, 17.5f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.5f, AnimationHelper.createRotationalVector(0f, 0f, -17.5f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.75f, AnimationHelper.createRotationalVector(0f, 0f, 17.5f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(1f, AnimationHelper.createRotationalVector(0f, 0f, -17.5f),
                                    Transformation.Interpolations.CUBIC))).build();
    public static final Animation STALKER_CRAWL = Animation.Builder.create(0.5f).looping()
            .addBoneAnimation("stalker",
                    new Transformation(Transformation.Targets.TRANSLATE,
                            new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, -6f, 0f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("stalker",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 5f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.25f, AnimationHelper.createRotationalVector(0f, 0f, -5f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.5f, AnimationHelper.createRotationalVector(0f, 0f, 5f),
                                    Transformation.Interpolations.CUBIC)))
            .addBoneAnimation("right_arm",
                    new Transformation(Transformation.Targets.TRANSLATE,
                            new Keyframe(0f, AnimationHelper.createTranslationalVector(1f, -2f, 0f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("right_arm",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(25f, 0f, 67.5f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.2916767f, AnimationHelper.createRotationalVector(-25f, 0f, 67.5f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.5f, AnimationHelper.createRotationalVector(25f, 0f, 67.5f),
                                    Transformation.Interpolations.CUBIC)))
            .addBoneAnimation("right_leg",
                    new Transformation(Transformation.Targets.TRANSLATE,
                            new Keyframe(0f, AnimationHelper.createTranslationalVector(1f, -2f, 0f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("right_leg",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(25f, 0f, 67.5f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.20834334f, AnimationHelper.createRotationalVector(-25f, 0f, 67.5f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.5f, AnimationHelper.createRotationalVector(25f, 0f, 67.5f),
                                    Transformation.Interpolations.CUBIC)))
            .addBoneAnimation("left_leg",
                    new Transformation(Transformation.Targets.TRANSLATE,
                            new Keyframe(0f, AnimationHelper.createTranslationalVector(-1f, -2f, 0f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("left_leg",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(-25f, 0f, -67.5f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.2916767f, AnimationHelper.createRotationalVector(25f, 0f, -67.5f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.5f, AnimationHelper.createRotationalVector(-25f, 0f, -67.5f),
                                    Transformation.Interpolations.CUBIC)))
            .addBoneAnimation("left_arm",
                    new Transformation(Transformation.Targets.TRANSLATE,
                            new Keyframe(0f, AnimationHelper.createTranslationalVector(-1f, -2f, 0f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("left_arm",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(-25f, 0f, -67.5f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.3433333f, AnimationHelper.createRotationalVector(25f, 0f, -67.5f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.5f, AnimationHelper.createRotationalVector(-25f, 0f, -67.5f),
                                    Transformation.Interpolations.CUBIC)))
            .addBoneAnimation("head",
                    new Transformation(Transformation.Targets.TRANSLATE,
                            new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, -1f, 0f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("head",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(-49.27f, 13.36f, -15.02f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.25f, AnimationHelper.createRotationalVector(-48.85f, -11.72f, 13.09f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.5f, AnimationHelper.createRotationalVector(-49.27f, 13.36f, -15.02f),
                                    Transformation.Interpolations.CUBIC))).build();
    public static final Animation STALKER_CLIMB = Animation.Builder.create(0.5f).looping()
            .addBoneAnimation("stalker",
                    new Transformation(Transformation.Targets.TRANSLATE,
                            new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, 8f, -1f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("stalker",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(-85f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.25f, AnimationHelper.createRotationalVector(-90f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.5f, AnimationHelper.createRotationalVector(-85f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("right_arm",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(-15f, 0f, 15f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.25f, AnimationHelper.createRotationalVector(15f, 0f, 15f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.5f, AnimationHelper.createRotationalVector(-15f, 0f, 15f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("right_leg",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(-15f, 0f, 15f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.2916767f, AnimationHelper.createRotationalVector(15f, 0f, 15f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.5f, AnimationHelper.createRotationalVector(-15f, 0f, 15f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("left_leg",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(15f, 0f, -15f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.2916767f, AnimationHelper.createRotationalVector(-15f, 0f, -15f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.5f, AnimationHelper.createRotationalVector(15f, 0f, -15f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("left_arm",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(15f, 0f, -15f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.25f, AnimationHelper.createRotationalVector(-15f, 0f, -15f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.5f, AnimationHelper.createRotationalVector(15f, 0f, -15f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("head",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(-24.81f, -3.16f, -6.8f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.25f, AnimationHelper.createRotationalVector(-14.68f, 3.39f, 9.37f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.5f, AnimationHelper.createRotationalVector(-24.81f, -3.16f, -6.8f),
                                    Transformation.Interpolations.LINEAR))).build();
    public static final Animation STALKER_BURROW = Animation.Builder.create(1.5f)
            .addBoneAnimation("stalker",
                    new Transformation(Transformation.Targets.TRANSLATE,
                            new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.4167667f, AnimationHelper.createTranslationalVector(0f, -6f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.625f, AnimationHelper.createTranslationalVector(0f, -13f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.75f, AnimationHelper.createTranslationalVector(0f, -19f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.9167666f, AnimationHelper.createTranslationalVector(0f, -24f, 0f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("stalker",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.25f, AnimationHelper.createRotationalVector(7.39f, 1.3f, -9.92f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.4167667f, AnimationHelper.createRotationalVector(27.14f, -4.6f, 8.89f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.625f, AnimationHelper.createRotationalVector(49.57f, 7.64f, -6.47f),
                                    Transformation.Interpolations.CUBIC)))
            .addBoneAnimation("right_arm",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 5f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.16766666f, AnimationHelper.createRotationalVector(-0.66f, -0.18f, -10f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.2916767f, AnimationHelper.createRotationalVector(-3.3f, 2.12f, 27.46f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.5f, AnimationHelper.createRotationalVector(-20f, 0f, 5f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.6766666f, AnimationHelper.createRotationalVector(-19.37f, -5.08f, -9.13f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.7916766f, AnimationHelper.createRotationalVector(-17.89f, 9.09f, 31.07f),
                                    Transformation.Interpolations.CUBIC)))
            .addBoneAnimation("right_leg",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 5f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.625f, AnimationHelper.createRotationalVector(65.86f, 0f, 5f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.9167666f, AnimationHelper.createRotationalVector(64.13f, -20.44f, 14.61f),
                                    Transformation.Interpolations.CUBIC)))
            .addBoneAnimation("left_leg",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, -5f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.7916766f, AnimationHelper.createRotationalVector(57.35f, 0f, -5f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.9167666f, AnimationHelper.createRotationalVector(56.1f, 14.67f, -14.65f),
                                    Transformation.Interpolations.CUBIC)))
            .addBoneAnimation("left_arm",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, -7.5f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.25f, AnimationHelper.createRotationalVector(-0.67f, -0.12f, -17.5f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.375f, AnimationHelper.createRotationalVector(-3.78f, 1.09f, 1.65f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.5f, AnimationHelper.createRotationalVector(-20f, 0f, -7.5f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.6766666f, AnimationHelper.createRotationalVector(-19.37f, -5.08f, -21.63f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.9167666f, AnimationHelper.createRotationalVector(-16.6f, 11.31f, 25.84f),
                                    Transformation.Interpolations.CUBIC)))
            .addBoneAnimation("head",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.25f, AnimationHelper.createRotationalVector(27.25f, 2.99f, -9.55f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.4167667f, AnimationHelper.createRotationalVector(34.44f, -5.74f, 11.13f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.5834334f, AnimationHelper.createRotationalVector(54.44f, -5.74f, 11.13f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.7916766f, AnimationHelper.createRotationalVector(50.1f, 17.34f, -7.62f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(1.0416767f, AnimationHelper.createRotationalVector(48.79f, -21.68f, 24.31f),
                                    Transformation.Interpolations.CUBIC))).build();
    public static final Animation STALKER_ATTACK = Animation.Builder.create(0.2916767f)
            .addBoneAnimation("stalker",
                    new Transformation(Transformation.Targets.TRANSLATE,
                            new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.16766666f, AnimationHelper.createTranslationalVector(0f, -2f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(0.2916767f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("stalker",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(-7.5f, 0f, 0f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.16766666f, AnimationHelper.createRotationalVector(12.5f, 0f, 0f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.2916767f, AnimationHelper.createRotationalVector(-7.5f, 0f, 0f),
                                    Transformation.Interpolations.CUBIC)))
            .addBoneAnimation("right_arm",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(-43.5f, 21.08f, 8.06f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.16766666f, AnimationHelper.createRotationalVector(-86.61f, -16.41f, -6.15f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.2916767f, AnimationHelper.createRotationalVector(-33.5f, 21.08f, 8.06f),
                                    Transformation.Interpolations.CUBIC)))
            .addBoneAnimation("right_leg",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 7.5f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.16766666f, AnimationHelper.createRotationalVector(10f, 0f, 2.5f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.2916767f, AnimationHelper.createRotationalVector(0f, 0f, 7.5f),
                                    Transformation.Interpolations.CUBIC)))
            .addBoneAnimation("left_leg",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, -5f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.125f, AnimationHelper.createRotationalVector(12.49f, 0.54f, -2.44f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.2916767f, AnimationHelper.createRotationalVector(0f, 0f, -5f),
                                    Transformation.Interpolations.CUBIC)))
            .addBoneAnimation("left_arm",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(-38.91f, -0.05f, -20.51f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.16766666f, AnimationHelper.createRotationalVector(-89.72f, 9.39f, 3.45f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.2916767f, AnimationHelper.createRotationalVector(-38.91f, -0.05f, -20.51f),
                                    Transformation.Interpolations.CUBIC)))
            .addBoneAnimation("head",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(-42.5f, 0f, 0f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.125f, AnimationHelper.createRotationalVector(37.5f, 0f, 0f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(0.2916767f, AnimationHelper.createRotationalVector(-42.5f, 0f, 0f),
                                    Transformation.Interpolations.CUBIC))).build();
}
