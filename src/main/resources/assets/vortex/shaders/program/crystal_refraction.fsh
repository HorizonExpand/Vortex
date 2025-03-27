#version 150

uniform sampler2D DiffuseSampler;

in vec2 texCoord;

out vec4 fragColor;

void main() {
    vec2 uv = texCoord;
    
    float strength = 0.02;
    float freq = 20.0;
    float anim = sin(gl_FragCoord.x * 0.03 + gl_FragCoord.y * 0.03) * 0.5 + 0.5;
    vec2 distortion = vec2(
        sin(uv.y * freq + anim),
        sin(uv.x * freq + anim)
    ) * strength;
    
    vec2 distortedUV = uv + distortion;
    distortedUV = clamp(distortedUV, 0.0, 1.0);
    
    vec4 color = texture(DiffuseSampler, distortedUV);
    fragColor = vec4(color.rgb, 1.0);
}